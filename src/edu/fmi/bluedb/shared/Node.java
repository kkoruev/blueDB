package edu.fmi.bluedb.shared;

import java.util.HashMap;
import java.util.Map;

public class Node {
	private String mId;
	private Map<String, Object> mProperties;
	private Map<Directions, Map<String, Node>> mRelationship;
	
	public Node(String id) {
		mId = id;
		mProperties = new HashMap<>();
		mRelationship = new HashMap<>();
	}
	
	public String getId() { 
		return mId;
	}
	
	public void addProperty(String key, Object entry) {
		mProperties.put(key, entry);
	}
	
	public void addRelationship(Directions direction, Node node) {
		Map<String, Node> nextNode = new HashMap<>();
		nextNode.put(node.getId(), node);
		mRelationship.put(direction, nextNode);
	}
}
