package catchup_10.practise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {
	
	//存已经输入的数组 
	private static List<Integer> list = new ArrayList<>();
	
	
	//对已经输入数据进行排序
	public static void sort() {
		Collections.sort(list);
	}


	public static List<Integer> getList() {
		return list;
	}


	public static void setList(List<Integer> list) {
		Data.list = list;
	}
	
	

}
