package com.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Represent_Graph_Adjacency_List {

	public static Represent_Graph_Adjacency_List glist;
	private Map<Integer, List<Integer>> adjacencyList;
	public LinkedList<Integer> adj[];

	public Represent_Graph_Adjacency_List(int v) {
		adjacencyList = new HashMap<Integer, List<Integer>>();
		for (int i = 1; i <= v; i++)
			adjacencyList.put(i, new LinkedList<Integer>());
	}

	public void setEdge(int to, int from) {
		if (to > adjacencyList.size() || from > adjacencyList.size()) {
			System.out.println("The vertices does not exists1");
		}

		List<Integer> sls = adjacencyList.get(to);
		sls.add(from);
		List<Integer> dls = adjacencyList.get(from);
		dls.add(to);
	}

	public List<Integer> getEdge(int to) {
		if (to > adjacencyList.size()) {
			System.out.println("The vertices does not exists2");
			return null;
		}
		return adjacencyList.get(to);
	}

	public void BfsTraversal(int from) {
		List<Integer> bfsvisited = new ArrayList<Integer>();
		List<Integer> bfstraverse = new ArrayList<Integer>();
		List<Integer> Bfs = new ArrayList<Integer>();
		System.out.println("BFS traversal------->");

		bfstraverse = adjacencyList.get(from);

		// System.out.println(adjacencyList);
		// System.out.println(bfstraverse.size());

		bfsvisited.add(from);
		Bfs.add(from);
		// while(!bfstraverse.isEmpty()){
		for (int i = 0; i < bfstraverse.size(); i++) {
			bfsvisited.add(bfstraverse.get(i));
			// System.out.println("traverse list contains"+bfstraverse);
			// System.out.println("traverse element"+bfstraverse.get(0));

			/*
			 * for(int i=0;i<adjacencyList.get(bfstraverse.get(0)).size();i++){
			 * if
			 * (!(bfsvisited.contains(adjacencyList.get(bfstraverse.get(0)).get
			 * (i))) &&
			 * !(bfstraverse.contains(adjacencyList.get(bfstraverse.get(
			 * 0)).get(i)))){
			 * bfstraverse.add(adjacencyList.get(bfstraverse.get(0)).get(i));
			 * //System
			 * .out.println("adding to treverse"+adjacencyList.get(bfstraverse
			 * .get(0)).get(i)); } }
			 */
			Bfs.add(bfstraverse.get(i));
		}

		System.out.println("Bfs is " + Bfs);

	}

	public void DfsTraversal(int from) {
		List<Integer> visited = new ArrayList<Integer>();
		List<Integer> traverse = new ArrayList<Integer>();
		List<Integer> dfs = new ArrayList<Integer>();
		System.out.println("DFS traversal------->");
		traverse = adjacencyList.get(from);
		// System.out.println(adjacencyList);
		// System.out.println(traverse.size());
		visited.add(from);
		dfs.add(from);
		// while(!traverse.isEmpty()){
		for (int i = 0; i < traverse.size(); i++) {
			visited.add(traverse.get(i));
			// System.out.println("traverse list contains"+traverse);
			// System.out.println("traverse element"+traverse.get(0));
			/*
			 * int k=1; for(int
			 * i=0;i<adjacencyList.get(traverse.get(0)).size();i++){
			 * if(!(visited.contains(adjacencyList.get(traverse.get(0)).get(i)))
			 * &&
			 * !(traverse.contains(adjacencyList.get(traverse.get(0)).get(i)))){
			 * traverse.add(k++,adjacencyList.get(traverse.get(0)).get(i));
			 * //System
			 * .out.println("adding to treverse"+adjacencyList.get(traverse
			 * .get(0)).get(i)); } }
			 */

			dfs.add(traverse.get(i));
		}
		System.out.println("dfs is " + dfs);
		// System.out.println(adjacencyList);
	}

	/*
	 * public boolean findPath(int n1,int n2){
	 * System.out.println("finding path..............."); ArrayList<Integer>
	 * list = new ArrayList<Integer>(); for (int i = n1; i <=
	 * adjacencyList.size(); i++){ System.out.print(i + "->"); List<Integer>
	 * edgeList = glist.getEdge(i); for (int j = 1;; j++){ if (j !=
	 * edgeList.size()) System.out.print(edgeList.get(j - 1) + " -> "); else{
	 * System.out.print(edgeList.get(j-1)); break; } } System.out.println(); }
	 * return false; }
	 */

	public void getPathbwNodes(int from, int to) {
		List<Integer> visited = new ArrayList<Integer>();
		List<Integer> traverse = new ArrayList<Integer>();
		List<Integer> dfs = new ArrayList<Integer>();

		System.out.println("Get Path------->");

		traverse = adjacencyList.get(from);

		// System.out.println(adjacencyList);
		/*
		 * while(!traverse.isEmpty()) { int i=traverse.get(0); if() }
		 */

		if (traverse.contains(to))
			System.out.println("path is there = " + from + " " + to);
		else {
			// System.out.println(traverse.size());
			visited.add(from);
			dfs.add(from);
			while (!traverse.isEmpty() && !(traverse.get(0) == to)) {
				visited.add(traverse.get(0));
				// System.out.println("traverse list contains"+traverse);
				// System.out.println("traverse element"+traverse.get(0));

				/*
				 * if() {
				 * 
				 * dfs.add(to); System.out.println("path is "+dfs); break; }
				 */

				for (int i = 0; i < adjacencyList.get(traverse.get(0)).size(); i++) {

					if (adjacencyList.get(traverse.get(0)).contains(to)) {
						System.out.println("path is there" + from + " " + to);
						break;
					}

					if (!(visited.contains(adjacencyList.get(traverse.get(0)).get(i)))
							&& !(traverse.contains(adjacencyList.get(traverse.get(0)).get(i)))) {
						traverse.add(adjacencyList.get(traverse.get(0)).get(i));
						// System.out.println("adding to treverse"+adjacencyList.get(traverse.get(0)).get(i)+traverse);

					}
				}

				dfs.add(traverse.remove(0));
			}
			dfs.add(to);
			// System.out.println("path between two nodes is "+dfs);
			// System.out.println(adjacencyList);
		}

	}

	public static void main(String ar[]){
		int v, e, count = 1, to, from;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number of vertices: ");
			v = sc.nextInt();
			System.out.println("Enter the number of edges: ");
			e = sc.nextInt();

			glist = new Represent_Graph_Adjacency_List(v);

			System.out.println("Enter the edges in the graph : <to> <from>");
			while (count <= e) {
				to = sc.nextInt();
				from = sc.nextInt();

				glist.setEdge(to, from);
				count++;
			}

			/*System.out.println("The Adjacency List Representation of the graph is: ");
			for (int i = 1; i <= v; i++) {
				//System.out.print(i + "[");
				List<Integer> edgeList = glist.getEdge(i);
				for (int j = 1;; j++) {
					if (j != edgeList.size())
						System.out.print(edgeList.get(j - 1) + " -> ");
					else {
						System.out.print(edgeList.get(j - 1));
						break;
					}
				}
				System.out.println();
			}*/
		} catch (Exception E) {
			System.out.println("Something went wrong" + E);
		}
		sc.close();
	}

}
