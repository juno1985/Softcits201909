package catchup_14.network;

import java.net.*;
import java.io.*;

public class Client
{
	private static final String HOST = "192.168.1.136";
	public static void main(String[] args)
		throws IOException
	{
		Socket socket = new Socket(HOST , 30000);
		// 将Socket对应的输入流包装成BufferedReader
		BufferedReader br = new BufferedReader(
		new InputStreamReader(socket.getInputStream()));
		// 进行普通IO操作
		String line = br.readLine();
		System.out.println("来自服务器的数据：" + line);
		// 关闭输入流、socket
		br.close();
		socket.close();
	}
}