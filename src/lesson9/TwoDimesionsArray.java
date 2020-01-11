package lesson9;

public class TwoDimesionsArray {

	public static void main(String[] args) {
		
		String[] str_arr = new String[2];
		str_arr[0] = "aa";
		str_arr[1] = "bb";
		str_arr[0] = "cc";
		
		String[][] str_arr_2d = new String[2][3];
		
		str_arr_2d[0][0] = "abc";
		str_arr_2d[0][1] = "bcd";
		str_arr_2d[0][2] = "def";
		
		
		String[] str1 = str_arr_2d[0];
		String[] str2 = str_arr_2d[1];
		
		
		
		int row_num = str_arr_2d.length;
		
		int column_num = str_arr_2d[0].length;
		
		System.out.println("row_num: " + row_num + " column_num: " + column_num);
		
		
		String[][][] str_arr_3d = new String[3][3][3];
		
		String[][][][] str_arr_4d = new String[3][3][3][3];

	}

}
