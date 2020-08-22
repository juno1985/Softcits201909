package catchup_5;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MarsExploration {


    // Complete the marsExploration function below.
    static int marsExploration(String s) {

    	final String compared = "SOS";
    	
    	int times = s.length() / 3;
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(times-- > 0) {
    		sb.append(compared);
    	}
    	
    	String standard = sb.toString();
    	
    	int result = 0;
    	
    	for(int i = 0; i < s.length(); i++) {
    		char s1 = s.charAt(i);
    		char s2 = standard.charAt(i);
    		if(s1 != s2)
    			result ++;
    	}
    	
    	
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
