package catchup_7;

import java.util.Scanner;

public class ShortestReachinaGraph {
	
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int testCases;
		 
		 testCases = scanner.nextInt();
		 
		 scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 
		 while(testCases-- > 0) {
			 int nodes, edges;
			 int start;
			 String[] line = scanner.nextLine().split(" ");
			 scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			 //Convert Sting to Integer
			 nodes = Integer.parseInt(line[0]);
			 edges = Integer.parseInt(line[1]);
			 
			 int[][] arr_edge = new int[edges][2];
			 
			 for(int i = 0; i < edges; i ++) {
				 // read edge
				 line = scanner.nextLine().split(" ");
				 scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
				 arr_edge[i][0] = Integer.parseInt(line[0]);
				 arr_edge[i][1] = Integer.parseInt(line[1]);
			 }
			 
			 start = scanner.nextInt();
			 scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			 //test above input
			// testInput(nodes, arr_edge, start);
		 }
		 
		 scanner.close();
		 
	 }
	 
	 public static void testInput(int nodes, int[][] arr_edge, int start) {
		 
		 System.out.println("------ test input ------");
		 System.out.println("node number: " + nodes);
		 System.out.println("start position: " + start);
		 System.out.println("all the edges: ");
		 for(int i = 0; i < arr_edge.length; i++) {
			 System.out.println(arr_edge[i][0] + " -> " + arr_edge[i][1]);
		 }
		 
	 }

}
