import java.util.Iterator;

public class ListIterator<T> implements Iterator<Node<T>> {
	private Node<T> current;

	public ListIterator(Node<T> first) {
		this.current = first;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public Node<T> next() {
		Node<T> temp = current;
		current = current.getNext();
		return temp;
	}

}
