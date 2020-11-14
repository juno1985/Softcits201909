package catchup_14;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		//查看当前工作目录
		System.out.println(System.getProperty("user.dir"));
		
		File file = new File("test.txt");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		
		
		File workFolder = new File("F:\\git-repo\\Softcits201909\\src");
		String[] subFiles = workFolder.list();
		for(String filename : subFiles)
			System.out.println(filename);
		
		

	}

}
