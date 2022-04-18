package entities;

public class Cell {

	private Object element;
	private Cell previous;
	private Cell next;

	public Cell(Object element) {
		this(element, null);
	}

	public Cell(Object elemento, Cell next) {
		this.element = elemento;
		this.next = next;
	}

	public Cell getNext() {
		return next;
	}

	public void setNext(Cell next) {
		this.next = next;
	}

	public Object getElement() {
		return element;
	}

	public Cell getPrevious() {
		return previous;
	}

	public void setPrevious(Cell previous) {
		this.previous = previous;
	}

	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Cell other = (Cell) obj;
		return other.getElement().equals(this.element);
	}

}
