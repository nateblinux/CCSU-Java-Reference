
public class Stack<E>{
	
	private Node<E> top;

	public Stack(E data) {
		top = new Node<E>(data);
		top.setPrev(null);
		top.setNext(null);
	}
	
	public void push(E data) {
		Node<E> newNode = new Node<E>(data);
		top.setNext(newNode);
		newNode.setPrev(top);
		top = newNode;
	}
	
	public E pop() {
		E data = top.getData();
		top = top.getPrev();
		return data;
	}
	
	
	private class Node<T>{
		private T data;
		private Node<T> next;
		private Node<T> prev;
		public Node(T data) {
			this.data = data;
		}
		
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}
		
		public Node<T> getPrev() {
			return this.prev;
		}
		
		public Node<T> getNext() {
			return this.next;
		}
		
		public T getData() {
			return this.data;
		}
		
	}

}
