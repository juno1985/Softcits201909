package catchup_3;

import java.util.Scanner;

public class HackerDay6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer cases = scan.nextInt();
		scan.nextLine();
		while(cases-- > 0) {
			String output = "";
			String str = scan.nextLine();
			//得到偶数子字符串
			output = output + getSubStr(0, str);
			//题目中要求偶数子串和奇数子串要空格分割
			output = output + " ";
			//得到奇数子串
			output = output + getSubStr(1, str);
			//输出结果
			System.out.println(output);
			
		}
		
    }
	/**
	 * 
	 * @param index - 起始下标
	 * @param str - 待读入的字符串
	 * @return 返回奇数/偶数字串，奇数情况 index =1， 偶数情况 index=0
	 */
	private static String getSubStr(int index, String str) {
		
		String result = "";
		
		char[] char_array = str.toCharArray();
		//步长为2
		for(int i = index; i < char_array.length; i+=2) {
			
			result = result + char_array[i];
			
		}
		
		return result;
	}

}	
