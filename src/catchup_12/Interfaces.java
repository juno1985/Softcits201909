package catchup_12;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	int sum = 0;
    	for(Integer t : getEvenlyDivisors(n)) 
    		sum += t;
        return sum;
    }
    public List<Integer> getEvenlyDivisors(int n){
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i = 1; i <= Math.sqrt(n); i++) {
    		if(n % i == 0 ) {
    			list.add(i);
    			if(i != n/i) list.add(n / i);
    		}
    	}
    	return list;
    }
}

class Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}