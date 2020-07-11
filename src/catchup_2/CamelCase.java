package catchup_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {

    	//saveChangesInTheEditor
    	char[] arr = s.toCharArray();
    
    	int count = 0;
    	
    	for(char c : arr) {
    		if(c >= 'A' && c <= 'Z') {
    			count++;
    		}
    	}
    	
    	return count + 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
