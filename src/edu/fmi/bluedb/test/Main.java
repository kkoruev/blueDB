package edu.fmi.bluedb.test;

import edu.fmi.bluedb.api.Graph;
import edu.fmi.bluedb.service.GraphService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = GraphService.getInstance();
		graph.addNode("User", "Kris");
		graph.addNode("User", "Reni");
		graph.addNode("Posts", "Angry");
		
		graph.getAllNodes();
	}

}
