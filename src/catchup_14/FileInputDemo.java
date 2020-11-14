package catchup_14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) {

		File file = new File("test.txt");
		//处理文件不存在，则抛出异常
		if(!file.exists()) {
			try {
				throw new FileNotFoundException("源文件不存在");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		FileInputStream fileInput = null;
		
		try {
			
			fileInput = new FileInputStream(file);
			byte[] buff = new byte[1024];
			int count;
			
			while((count = fileInput.read(buff)) != -1) {
				String str = new String(buff, 0, count, "UTF-8");
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if( fileInput != null) {
				try {
					fileInput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
