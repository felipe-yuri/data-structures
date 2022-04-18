package entities;

public class Queue<E> {

	private LinkedList<E> list = new LinkedList<E>();
	private int totalElements = 0;

	public void add(E element) {
		list.add(element);
		totalElements++;
	}

	public E poll() {
		E object = (E) list.get(0);
		list.remove(0);
		totalElements--;
		return object;
	}

	public int length() {
		return list.length();
	}
	
	public boolean isEmpty() {
		return list.length() == 0;
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
