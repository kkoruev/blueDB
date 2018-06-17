package edu.fmi.bluedb.api;

public interface Graph {
	
	void addNode(String label, String id);
	
	void removeNode(String label, String id);
	
	void addRelationship(String labelFrom, String idFrom, String labelTo,
			String idTo);
}
