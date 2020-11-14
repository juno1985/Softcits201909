package catchup_14.network;

import java.net.*;
import java.io.*;

public class Client {
	private static final String HOST = "192.168.1.136";
	public static void main(String[] args) throws IOException {
		// 链接目的服务器 主机名，端口
		Socket socket = new Socket(HOST, 2888);
		// 读取来自server端的信息
		InputStream input = socket.getInputStream();
		// 向server端发送信息
		OutputStream output = socket.getOutputStream();
		// 数组的缓冲数组
		byte[] buff = new byte[1024];

		// 创建键盘输入流
		InputStream keyboardInput = System.in;

		// 从服务器读取数据
		Thread readServerThread = new Thread(() -> {
			while (true) {
				// 将Socket对应的输入流包装成BufferedReader
				BufferedReader br = new BufferedReader(
						new InputStreamReader(input));
				// 进行普通IO操作
				String line;
				try {
					line = br.readLine();
					System.out.println("来自服务器的数据：" + line);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		});

		readServerThread.start();

		// 新建一个负责从键盘读取发送到服务器
		Thread readFromServer = new Thread(() -> {
			while (true) {
				int count;
				// 循环从键盘输入到buff数组
				try {
					while ((count = keyboardInput.read(buff)) != -1) {
						// 发向server端
						output.write(buff, 0, count);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}, "Client-Reader-Thread");

		readFromServer.start();

	}
}