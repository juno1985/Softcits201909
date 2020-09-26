package catchup_9;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionsStringtoInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
			Integer result = Integer.parseInt(S);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
    }
}