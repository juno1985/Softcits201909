package lesson10;

import java.util.List;

public class NodeDemo {

	int data;
	NodeDemo next;
	
	

	public NodeDemo(int data) {
		this.data = data;
	}



	boolean hasCycle(NodeDemo head) {

		NodeDemo node1 = new NodeDemo(1);
		NodeDemo node2 = new NodeDemo(1);
		
		List<NodeDemo> list = new ArrayList<>();
		
		NodeDemo node = head;
		
		while(node!=null) {
			if(list.contains(node)) return true;
			
			list.add(node);
			
			node = node.next;
		}
		
		return false;
	}

}
