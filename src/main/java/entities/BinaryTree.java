package entities;

public class BinaryTree<E> {

	private Node<E> root;
	private Node<E> ancerstor;

	public void insert(E key) {
		if (root == null) {
			root = new Node<E>(key);
			ancerstor = root;
		} else {
			insert(ancerstor, key);
		}

	}

	public void insert(Node<E> ancerstor, E key) {
		if (moreThan(key)) {
			if (ancerstor.getRight() == null) {
				ancerstor.setRight(key);
			} else if (ancerstor.getLeft() == null) {
				if (moreThan(key)) {
					ancerstor.setLeft(ancerstor.getRight());
					ancerstor.setRight(key);
				} else {
					ancerstor.setLeft(key);
				}
			} else {
				Node<E> newNode = new Node<E>(key);
				newNode.setKey(key);
				this.ancerstor = newNode;
			}
			this.ancerstor = ancerstor;
		} else {
			ancerstor.setLeft(key);
			this.ancerstor = ancerstor;
		}
	}

	private boolean moreThan(E key) {
		return key.hashCode() > ancerstor.getKey().hashCode();
	}

	public void search() {

	}

	public void inOrder() {

	}

	public void preOrder() {

	}

	public void postOrder() {

	}

	public void min() {

	}

	public void max() {

	}

	public void remove() {

	}

	public Node<E> getRoot() {
		if (root == null) {
			throw new NullPointerException("Is null");
		}
		return root;
	}

}
