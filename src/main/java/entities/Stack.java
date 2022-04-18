package entities;

public class Stack<E> {

	private LinkedList<String> list = new LinkedList<String>();
	private int totalElements = 0;

	public void push(Object element) {
		list.add(element);
		totalElements++;
	}

	public E pop() {
		E object = (E) list.get(list.length() - 1);
		list.remove();
		totalElements--;
		return object;
	}

	public boolean isEmpty() {
		return list.length() == 0;
	}

	public int length() {
		return totalElements;
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
