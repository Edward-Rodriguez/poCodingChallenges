public class Node<T> {
	private T item;
	private Node<T> next;

	Node(T data) {
		this.item = data;
		this.next = null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
