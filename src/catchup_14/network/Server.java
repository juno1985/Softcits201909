package catchup_14.network;

import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Server {
	
	static volatile String readline;
	
	public static void main(String[] args) throws IOException {
		//保存所有和客户端连接的socket
		List<Socket> clients = new ArrayList<>();
		
		// 创建一个ServerSocket，用于监听客户端Socket的连接请求
		ServerSocket ss = new ServerSocket(2888);
		// 采用循环不断接受来自客户端的请求
		while (true) {
			// 每当接受到客户端Socket的请求，服务器端也对应产生一个Socket
			Socket s = ss.accept();
			// 一旦链接成功，加入list
			clients.add(s);
			
			// 服务器端生成输入流
			InputStream input = s.getInputStream();
			
			// 将Socket对应的输出流包装成PrintStream
			PrintStream ps = new PrintStream(s.getOutputStream());
			// 进行普通IO操作
			ps.println("您已经成功连接服务器");
						
			// 创建一个负责读取客户端信息的线程
			Thread readFromClient = new Thread(
					()->{
						try {
							// 记录每次从client读取的字节数
							int count;
							// 缓冲数组
							byte[] buff = new byte[1024];
							// 循环从client端读取数据
							while ((count = input.read(buff)) != -1) {
								readline = new String(buff, 0, count);
								System.out.println(readline);
								for(Socket socket : clients) {
									try {
										OutputStream output = socket.getOutputStream();
										PrintStream outps = new PrintStream(output);
										outps.print(readline);
									} catch (IOException e) {
										e.printStackTrace();
									}
									
								}
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}, 
					"Server-Reader-Thread");
			
			readFromClient.start();
			
			
		}
		
		
	}
}
