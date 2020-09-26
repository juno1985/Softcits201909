package catchup_9;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements) {
          this.elements = elements;
      }

    public void computeDifference() {
        
        //ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(array));
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < this.elements.length; i++) {
            list.add(this.elements[i]);
        }
        
        //排序器。。待讲
        Collections.sort(list);
        
        this.maximumDifference = list.get(list.size() - 1) - list.get(0);
        
        
        
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}