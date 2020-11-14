package catchup_14;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ManualInput {

	public static void main(String[] args) {
		//输入流
		InputStream inputStream = System.in;
		/*
		 * Scanner scan = new Scanner(System.in); 
		 * scan.nextLine();
		 */
		
		byte[] buff = new byte[8];
		FileOutputStream fileOutput = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			
			File file = new File("keyboardinput.txt");
			
			if(!file.exists()) file.createNewFile();
			
			//得到文件的输出流
			fileOutput = new FileOutputStream(file);
			//包装成BufferedOutputStream
			bufferedOutputStream = new BufferedOutputStream(fileOutput);
			//记载累计读了多少字节
			int size = 0;
			int count;
			//ctrl+z 会发出eof 即输入关闭信号，此时count = -1
			while((count = inputStream.read(buff)) != -1) {
				//buff是二进制的字节流,但是我们肉眼能识别的只能是字符流
				//所以需要字节流转字符流 - 即将byte数组转化为String
				String str = new String(buff, 0, count);
				//屏幕输出键盘输入的内容
				System.out.println("读到键盘输入: " + str);
				
				//写入文件
				//fileOutput.write(buff, 0, count);
				
				size += count;
				
				bufferedOutputStream.write(buff, 0, count);
				// 强行内存和硬盘同步
				if(size >= buff.length) {
					size = 0;
					bufferedOutputStream.flush();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				if(fileOutput != null)
					fileOutput.close();
				bufferedOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
