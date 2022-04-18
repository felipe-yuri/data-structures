package entities;

public class Node<E> {

	private E key;
	private E left;
	private E right;

	public Node(E key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}

	public E getLeft() {
		return left;
	}

	public void setLeft(E left) {
		this.left = left;
	}

	public E getRight() {
		return right;
	}

	public void setRight(E right) {
		this.right = right;
	}

	public E getKey() {
		return key;
	}
	
	public void setKey(E key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", left=" + left + ", right=" + right + "]";
	}

}
