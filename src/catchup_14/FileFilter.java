package catchup_14;

import java.io.File;
import java.io.IOException;

public class FileFilter {
	public static void main(String[] args) throws IOException{
		
		//指定当前路径，即workspace项目路径
		File file = new File(".");
		
		System.out.println(file.getAbsolutePath());

		//1，正常写法
		//String[] fileList = file.list(new FileFilterImpl());
		
		String[] fileList = file.list((dir, name)
				->{
					return name.endsWith(".txt");}
				);
		
		for(String fileName : fileList)
			System.out.println(fileName);
		
		
	}

}
