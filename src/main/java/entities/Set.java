package entities;

public class Set<E> {

	private LinkedList<LinkedList<E>> table = new LinkedList<LinkedList<E>>();

	public Set() {
		for (int i = 0; i < 26; i++) {
			table.add(new LinkedList<E>());
		}
	}

	public void add(E element) {
		if (!contains(element)) {
			int index = calculeIndexTable(element);
			LinkedList<E> list = (LinkedList<E>) table.get(index);
			list.add(element);
		}
	}
	
	public void remove(E element) {
		if (contains(element)) {
			int index = calculeIndexTable(element);
			LinkedList<E> list = (LinkedList<E>) table.get(index);
			list.remove(index);
		}
	}

	private boolean contains(E element) {
		int index = calculeIndexTable(element);
		return ((LinkedList<LinkedList<E>>) table.get(index)).contains(element);
	}

	private int calculeIndexTable(E element) {
		return element.toString().toLowerCase().charAt(0) % 26;
	}

	@Override
	public String toString() {
		return table.toString();
	}
	
	

}
