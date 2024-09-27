import java.security.InvalidParameterException;

//this is a custom linked list class to hold 
//integer values
public class CustomLinkedList {

	protected Node rootNode = null;
	protected Node endNode = null;

	public class Node {
		public Node previous;
		public Node next;
		public int data;
	}

	public void Add(int data) {
		// create a new node and copy the value in
		Node newNode = new Node();
		newNode.data = data;

		// check if there is a root node
		// if not the new node is the root node and we are done
		if (rootNode == null) {
			rootNode = newNode;
			endNode = newNode;
			return;
		}

		// add the new node to the end of the list
		newNode.previous = endNode;
		endNode.next = newNode;
		endNode = newNode;
	}

	public int Count() {
		Node currentNode = rootNode;

		if (currentNode == null) {
			return 0;
		}

		int count = 0;
		while (currentNode.next != null) {
			++count;
			currentNode = currentNode.next;
		}

		return count;
	}

	public int Get(int index) {
		Node currentNode = rootNode;

		if (currentNode == null) {
			throw new InvalidParameterException("Index out of bounds! List is empty!");
		}

		int count = 0;
		while (currentNode != null) {
			if(count == index) {
				return currentNode.data;
			}
			
			++count;
			currentNode = currentNode.next;
		}
		
		throw new InvalidParameterException("Index out of bounds! Index does not exist!");
	}
	
	public void Remove(int index) {
		Node currentNode = rootNode;

		if (currentNode == null) {
			throw new InvalidParameterException("Index out of bounds! List is empty!");
		}

		int count = 0;
		while (currentNode != null) {
			if(count == index) {
				
				Node left = currentNode.previous;
				Node right = currentNode.next;
				
				if(left != null) {
					left.next = right;
				}
				
				if(right != null) {
					right.previous = left;
				}
			}
			
			++count;
			currentNode = currentNode.next;
		}
		
		throw new InvalidParameterException("Index out of bounds! Index does not exist!");
	}
}
