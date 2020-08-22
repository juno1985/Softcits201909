package catchup_5;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {
	
	

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
    	
    	String numbers = "0123456789";
    	String lower_case = "abcdefghijklmnopqrstuvwxyz";
    	String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String special_characters = "!@#$%^&*()-+";
    	
    	//不符合条件的计数器
    	int notMatch = 0;
    	//String numbers = "0123456789";
    	if(!ifMatch(numbers, password)) notMatch++;
    	//String lower_case = "abcdefghijklmnopqrstuvwxyz";
    	if(!ifMatch(lower_case, password)) notMatch++;
    	//String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	if(!ifMatch(upper_case, password)) notMatch++;
    	//String special_characters = "!@#$%^&*()-+";
    	if(!ifMatch(special_characters, password)) notMatch++;
    	
    	if(password.length() > 6) return notMatch;
    	else {
    		int missingLength = 6 - password.length();
    		
    		return missingLength > notMatch ? missingLength : notMatch;
    	}
    	

    }
    
    static boolean ifMatch(String standard, String password) {
    	//遍历password每一个char
    	for(int i = 0; i < password.length(); i ++) {
    		char c = password.charAt(i);
    		//如果找到了
    		if(standard.indexOf(c) != -1) return true;
    	}
    	//如果一个都没找到，返回false
    	return false;
    	
    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
