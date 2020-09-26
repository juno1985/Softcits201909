package catchup_9;


//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictionariesandMaps{
  public static void main(String []argh){
	  
	  Map<String, Integer> map = new HashMap<>();
	  
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          map.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          Integer phone = map.get(s);
          if(phone == null) System.out.println("Not found");
          else System.out.println(s + "=" + phone);
      }
      in.close();
  }
}