package edu.fmi.bluedb.service;

import java.util.HashMap;
import java.util.Map;

import edu.fmi.bluedb.api.Graph;
import edu.fmi.bluedb.shared.Node;

public class GraphService implements Graph{

	Map<String, Map<String, Node>> store;
	
	private static class Holder {
		private static final GraphService INSTANCE = 
				new GraphService();
	}
	
	private GraphService() {
		store = new HashMap<>();
	}
	
	public GraphService getInstance() { 
		return Holder.INSTANCE;
	}

	@Override
	public void addNode(String label, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeNode(String label, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRelationship(String labelFrom, String idFrom, String labelTo, String idTo) {
		// TODO Auto-generated method stub
		
	}
}
