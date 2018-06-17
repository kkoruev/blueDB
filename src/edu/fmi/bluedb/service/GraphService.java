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
	
	public static GraphService getInstance() { 
		return Holder.INSTANCE;
	}

	@Override
	public void addNode(String label, String id) {
		Node node = new Node(id);
		Map<String, Node> nodes;
		if (store.containsKey(label)) {
			nodes = store.get(label);
			nodes.put(id, node);
		} else {
			nodes = new HashMap<>();
			nodes.put(id, node);
		}

		store.put(label, nodes);
		
	}

	@Override
	public void removeNode(String label, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRelationship(String labelFrom, String idFrom, String labelTo, String idTo) {
		Map<String, Node> nodesFrom = store.get(labelFrom);
		Node nodeFrom = nodesFrom.get(idFrom);
		
		Map<String, Node> nodesTo = store.get(labelTo);
		Node nodeTo = nodesTo.get(idTo);
	}
	
	@Override
	public void getAllNodes() {
		//TO DO: Later should return String, now just printing
		for(String label : store.keySet()) {
			Map<String, Node> nodes = store.get(label);
			for (String node_label : nodes.keySet()) {
				System.out.println("From label " + node_label);
				Node node = nodes.get(node_label);
				System.out.println("    Node id: " + node.getId());
			}
		}
	}
}
