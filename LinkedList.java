
public class LinkedList <E>{
	
	Node <E> current;
	int len = 0;

	public LinkedList(E data) {
		current = null;
	}
	
	public void add(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.setNext(current);
		current = newNode;
		len++;
	}
	
	public E getNode(int index) {
		if(index >= len) {
			return null;
		}
		Node<E> e = current;
		for(int i = len; i > index + 1; i--) {
			if(e.getNext() == null) {
				return null;
			}
			e = e.getNext();
		}
		return e.getData();
	}
	
	public int getSize() {
		return len;
	}
	
	
	private class Node<T>{
		private T data;
		private Node<T> next;
		public Node(T data) {
			this.data = data;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
		public Node<T> getNext() {
			return this.next;
		}
		
		public T getData() {
			return this.data;
		}
		
	}

}
