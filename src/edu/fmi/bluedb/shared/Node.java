package edu.fmi.bluedb.shared;

import java.util.HashMap;
import java.util.Map;

public class Node {
	private String mId;
	private Map<String, Object> mProperties;
	private Map<Directions, Map<String, Map<String, Node>>> mRelationship;
	
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
	
	public void addRelationship(Directions direction, Node node,
			String relationshipName) {
		Map<String, Node> nextNodes;
		
		if (mRelationship.containsKey(direction)) {
			nextNodes = mRelationship.get(direction).get(relationshipName);
			nextNodes.put(node.getId(), node);
			
		} else {
			
		}
//		mRelationship.put(direction, nextNode);
	}
}
