package com.assignment4;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WeightedGraphShortPath {
	 private int          distances[];
	    private Set<Integer> settled;
	    private Set<Integer> unsettled;
	    private int          number_of_nodes;
	    private int          adjacencyMatrix[][];
	    int number_of_vertices;
	    public int adjacency_matrix[][];
	    
	    public WeightedGraphShortPath(int number_of_nodes)
	    {
	        this.number_of_nodes = number_of_nodes;
	        number_of_vertices = number_of_nodes;
	        distances = new int[number_of_nodes + 1];
	        settled = new HashSet<Integer>();
	        unsettled = new HashSet<Integer>();
	        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
	    }
	 
	    public void exeLogic(int adjacency_matrix[][], int source)
	    {
	        int evaluationNode;
	        for (int i = 1; i <= number_of_nodes; i++)
	            for (int j = 1; j <= number_of_nodes; j++){
	            	//System.out.println(adjacency_matrix[i][j]);
	                adjacencyMatrix[i][j] = adjacency_matrix[i][j];
	            }
	 
	        for (int i = 1; i <= number_of_nodes; i++)
	        {
	            distances[i] = Integer.MAX_VALUE;
	        }
	 
	        unsettled.add(source);
	        distances[source] = 0;
	        while (!unsettled.isEmpty())
	        {
	            evaluationNode = getNodeWithMinimumDistanceFromUnsettled();
	            unsettled.remove(evaluationNode);
	            settled.add(evaluationNode);
	            evaluateNeighbours(evaluationNode);
	        }
	    }
	 
	    private int getNodeWithMinimumDistanceFromUnsettled()
	    {
	        int min;
	        int node = 0;
	 
	        Iterator<Integer> iterator = unsettled.iterator();
	        node = iterator.next();
	        min = distances[node];
	        for (int i = 1; i <= distances.length; i++)
	        {
	            if (unsettled.contains(i))
	            {
	                if (distances[i] <= min)
	                {
	                    min = distances[i];
	                    node = i;
	                }
	            }
	        }
	        return node;
	    }
	 
	    private void evaluateNeighbours(int evaluationNode)
	    {
	        int edgeDistance = -1;
	        int newDistance = -1;
	 
	        for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++)
	        {
	            if (!settled.contains(destinationNode))
	            {
	                if (adjacencyMatrix[evaluationNode][destinationNode] != Integer.MAX_VALUE)
	                {
	                    edgeDistance = adjacencyMatrix[evaluationNode][destinationNode];
	                    newDistance = distances[evaluationNode] + edgeDistance;
	                    if (newDistance < distances[destinationNode])
	                    {
	                        distances[destinationNode] = newDistance;
	                    }
	                    unsettled.add(destinationNode);
	                }
	            }
	        }
	    }
	    
	    
	    public int findShoetestPath(int source,int destination){
	    	//System.out.println(adjacency_matrix);
	    	exeLogic(adjacency_matrix,source);
            System.out.print("The Shortest Path from " + source + " to " + destination + " is: " );
            for (int i = 1; i <= distances.length - 1; i++)
            {
            	//System.out.println(distances[i]);
                if (i == destination){
                   return distances[i];
                }
            }
	    	return -1;
	    }
	    
	    public void createGraph(){
	    	 
		        Scanner scan = new Scanner(System.in);
		        try{
		            adjacency_matrix = new int[number_of_vertices + 1][number_of_vertices + 1];
		 
		            System.out.println(number_of_vertices+"  Enter the Weighted Matrix for the graph");
		            for (int i = 1; i <= number_of_vertices; i++){
		                for (int j = 1; j <= number_of_vertices; j++){
		                    adjacency_matrix[i][j] = scan.nextInt();
		                    if (i == j){
		                        adjacency_matrix[i][j] = 0;
		                        continue;
		                    }
		                    if (adjacency_matrix[i][j] == 0){
		                        adjacency_matrix[i][j] = Integer.MAX_VALUE;
		                    }
		                }
		            }
		        }catch(Exception e){
		        	System.out.println(e);
		        }
	    	
	    }
	    
	   
	 
	    public static void main(String... arg){
	        int source = 0, destination = 0;
	        WeightedGraphShortPath wgsp = new WeightedGraphShortPath(3);
            wgsp.createGraph();
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter the source ");
            source = scan.nextInt();
 
            System.out.println("Enter the destination ");
            destination = scan.nextInt();
            
            System.out.print(wgsp.findShoetestPath(source,destination));
            
	        scan.close();
	    }
}
