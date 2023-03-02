

public class Queue <E>{
	
	private Node<E> head;
	private Node<E> tail;
	private int size;

	public Queue() {
		head = new Node<E>(null);
		tail = new Node<E>(null);
		head.setPrev(tail);
		tail.setNext(head);
		size = 0;
	}
	
	public void enqueue(E data) {
		Node<E> newNode = new Node<E>(data);
		if(isEmpty()) {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			newNode.setNext(head);
			head.setPrev(newNode);
			size++;
		}else {
			head.getPrev().setNext(newNode);
			newNode.setNext(head);
			newNode.setPrev(head.getPrev());
			head.setPrev(newNode);
			size++;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public E dequeue() {
		if(size == 0) {
			return null;
		}
		E data = tail.getNext().getData();
		tail.setNext(tail.getNext().getNext());
		size--;
		return data;
	}
	
	public E front() {
		if(size > 0)
			return tail.getNext().getData();
		else 
			return null;
	}
	
	public boolean isEmpty() {
		return size ==0;
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
		
		public void setPrev(Node <T> prev) {
			this.prev = prev;
		}
		
		public Node<T> getPrev(){
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
