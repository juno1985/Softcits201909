package catchup_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ShortestReachinaGraph {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int testCases;

		testCases = scanner.nextInt();

		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		while (testCases-- > 0) {
			int nodes, edges;
			int start;
			String[] line = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			// Convert Sting to Integer
			nodes = Integer.parseInt(line[0]);
			edges = Integer.parseInt(line[1]);

			int[][] arr_edge = new int[edges][2];

			for (int i = 0; i < edges; i++) {
				// read edge
				line = scanner.nextLine().split(" ");
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
				arr_edge[i][0] = Integer.parseInt(line[0]);
				arr_edge[i][1] = Integer.parseInt(line[1]);
			}

			start = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			// test above input
			// testInput(nodes, arr_edge, start);

			/*
			 * Map<Integer, List<Integer>> map = setRouteMap(arr_edge);
			 * 
			 * Set<Integer> set = map.keySet();
			 * 
			 * for(Integer t : set) { List<Integer> list = map.get(t);
			 * 
			 * System.out.println(t + " -> " + list); }
			 */
			
			int[] result = shortestRoute(nodes, arr_edge, start);

			for(int i = 1; i < result.length; i++) {
				if(i != start)
				System.out.print(result[i] + " ");
			}
			
			System.out.println();

		}

		scanner.close();

	}
	public static int[] shortestRoute(int nodes, int[][] arr_edge, int start) {
		
		Map<Integer, List<Integer>> map_route = setRouteMap(arr_edge);

		int[] arr_route = new int[nodes + 1];
		// default not connected
		for (int i = 0; i < arr_route.length; i++)
			arr_route[i] = -1;
		// set start to start as 0
		arr_route[start] = 0;
		// the num of steps
		int steps = 0;

		List<Integer> curPosition = new ArrayList<>();
		List<Integer> nextPosition = new ArrayList<>();
		
		//store the visited node
		Set<Integer> visitedSet = new HashSet<>();
		
		// add start point
		curPosition.add(start);
		

		while (!curPosition.isEmpty()) {
			steps++;
			for (Integer pos : curPosition) {
				visitedSet.add(start);
				List<Integer> list = map_route.get(pos);
				// if no connected node, terminate
				if(list == null) continue;
				for(Integer nextPos : list) {
					if(visitedSet.contains(nextPos)) continue;
					arr_route[nextPos] = steps * 6;
					//add next poisiton as next start
					nextPosition.add(nextPos);
				}
				
			}
			curPosition.clear();
			curPosition.addAll(nextPosition);
			nextPosition.clear();
		}
		
		return arr_route;

	}
	public static void testInput(int nodes, int[][] arr_edge, int start) {

		System.out.println("------ test input ------");
		System.out.println("node number: " + nodes);
		System.out.println("start position: " + start);
		System.out.println("all the edges: ");
		for (int i = 0; i < arr_edge.length; i++) {
			System.out.println(arr_edge[i][0] + " -> " + arr_edge[i][1]);
		}

	}

	public static Map<Integer, List<Integer>> setRouteMap(int[][] arr_edge) {

		Map<Integer, List<Integer>> hashMap = new HashMap<>();

		for (int i = 0; i < arr_edge.length; i++) {
			// the start node of edge
			int start = arr_edge[i][0];
			// the end node of edge
			int end = arr_edge[i][1];
			List<Integer> list0;
			if ((list0 = hashMap.get(start)) == null) {
				list0 = new ArrayList<>();
			}
			list0.add(end);
			hashMap.put(start, list0);

			// add the edge of end to start
			List<Integer> list1;
			if ((list1 = hashMap.get(end)) == null) {
				list1 = new ArrayList<>();
			}
			list1.add(start);
			hashMap.put(end, list1);

		}

		return hashMap;

	}

}
