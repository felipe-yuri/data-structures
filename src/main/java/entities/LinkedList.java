package entities;

public class LinkedList<E> {

	private Cell first = null;
	private Cell last = null;
	private int totalElements = 0;

	private boolean indexExists(int index) {
		return index >= 0 && index <= totalElements;
	}

	private boolean indexBusy(int index) {
		return index >= 0 && index < totalElements;
	}

	private Cell getCell(int index) {
		if (!indexExists(index)) {
			throw new IllegalArgumentException("Index not exists!");
		}
		if (!indexBusy(index)) {
			throw new IllegalArgumentException("Index is empty!");
		}
		Cell currentCell = first;

		for (int i = 0; i < index; i++) {
			currentCell = currentCell.getNext();
		}

		return currentCell;
	}

	public void addAtBegin(Object element) {
		if (totalElements == 0) {
			Cell newCell = new Cell(element);
			this.first = newCell;
			this.last = newCell;
		} else {
			Cell newCell = new Cell(element, this.first);
			this.first.setPrevious(newCell);
			this.first = newCell;
		}

		this.totalElements++;
	}

	public void add(Object element) {
		if (totalElements == 0) {
			addAtBegin(element);
		} else {
			Cell newCell = new Cell(element);
			last.setNext(newCell);
			newCell.setPrevious(last);
			last = newCell;
			totalElements++;
		}
	}

	public void add(int index, Object element) {
		if (index == 0) {
			addAtBegin(element);
		} else if (index == totalElements) {
			add(element);
		} else {
			Cell previousCell = getCell(index - 1);
			Cell nextCell = previousCell.getNext();
			Cell newCell = new Cell(element, previousCell.getNext());
			newCell.setPrevious(previousCell);
			previousCell.setNext(newCell);
			nextCell.setPrevious(newCell);
			totalElements++;
		}
	}

	public Object get(int index) {
		return getCell(index).getElement();
	}

	public void removeAtBegin() {
		if (totalElements == 0) {
			last = null;
			throw new IllegalArgumentException("Nothing to remove!");
		}
		first = first.getNext();
		totalElements--;

	}

	public void remove() {
		if (totalElements == 0) {
			throw new IllegalArgumentException("Nothing to remove!");
		}
		if (totalElements == 1) {
			removeAtBegin();
		} else {
			Cell penult = last.getPrevious();
			penult.setNext(null);
			last = penult;
			totalElements--;
		}
	}

	public void remove(int index) {
		if (totalElements == 0) {
			throw new IllegalArgumentException("Nothing to remove!");
		}
		if (!indexExists(index)) {
			throw new IllegalArgumentException("Index not exists!");
		}
		if (!indexBusy(index)) {
			throw new IllegalArgumentException("Index is empty!");
		}
		if (index == 0) {
			removeAtBegin();
		} else if (index == totalElements - 1) {
			remove();
		} else {
			Cell previousCell = getCell(index - 1);
			Cell currentCell = previousCell.getNext();
			Cell nextCell = currentCell.getNext();
			previousCell.setNext(nextCell);
			nextCell.setPrevious(previousCell);
			totalElements--;
		}
	}

	public int length() {
		return totalElements;
	}

	public boolean contains(Object element) {
		Cell currentCell = first;

		while (currentCell != null) {
			if (currentCell.getElement().equals(element)) {
				return true;
			}
			currentCell = currentCell.getNext();
		}
		return false;
	}

	@Override
	public String toString() {
		if (totalElements == 0) {
			return "[]";
		}

		Cell current = first;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalElements; i++) {
			builder.append(current.getElement());
			current = current.getNext();
			if (current != null) {
				builder.append(", ");
			}
		}
		builder.append("]");
		return builder.toString();
	}

}
