package catchup_14;

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
		
		byte[] buff = new byte[1024];
		FileOutputStream fileOutput = null;
		try {
			
			File file = new File("keyboardinput.txt");
			
			if(!file.exists()) file.createNewFile();
			
			//得到文件的输出流
			fileOutput = new FileOutputStream(file);
			
			int count;
			//ctrl+z 会发出eof 即输入关闭信号，此时count = -1
			while((count = inputStream.read(buff)) != -1) {
				//buff是二进制的字节流,但是我们肉眼能识别的只能是字符流
				//所以需要字节流转字符流 - 即将byte数组转化为String
				String str = new String(buff, 0, count);
				//屏幕输出键盘输入的内容
				System.out.println("读到键盘输入: " + str);
				
				//写入文件
				fileOutput.write(buff, 0, count);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				if(fileOutput != null)
					fileOutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
