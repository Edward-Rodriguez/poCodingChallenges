import java.util.Iterator;

/* Edward Rodriguez
 * Problem 2: Write a program and show how to implement stack using Linked List in java.
 * (note: implement your own linked list or use the one provided by java)*/

public class LinkedListStack<T> implements Iterable<Node<T>> {
	Node<T> head;
	int size;

	public LinkedListStack() {
		this.head = null;
		this.size = 0;
	}

	public void push(T data) {
		Node<T> newHead = new Node<T>(data);
		newHead.setNext(this.head);
		this.head = newHead;
		size++;
	}

	public T pop() throws Exception {
		if (this.head == null) {
			throw new Exception("Stack Underflow");
		} else {
			T data = this.head.getItem();
			this.head = this.head.getNext();
			size--;
			return data;
		}
	}

	public static void main(String[] args) {

		LinkedListStack<Integer> stack = new LinkedListStack<>();

		int[] arr = { 21, 34, 56, 76, 100, 99, 10 };

		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}

		stack.forEach((element) -> {
			System.out.print(element.getItem() + " ");
		});

		try {
			System.out.println("\nLast in: " + stack.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new ListIterator<T>(this.head);
	}

}
