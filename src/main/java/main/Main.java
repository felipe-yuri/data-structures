package main;

import entities.BinaryTree;
import entities.Node;
import entities.Queue;
import entities.Set;
import entities.Stack;

public class Main {

	public static void main(String[] args) {
		
//		LinkedList<String> list = new LinkedList<String>();
//		list.addAtBegin("Felipe");
//		System.out.println(list);
//		list.addAtBegin("Yuri");
//		System.out.println(list);
//		list.addAtBegin("Silva");
//		System.out.println(list);
//		list.add("Rhaysa");
//		System.out.println(list);
//		list.add(2, "Vera");
//		System.out.println(list);
//		System.out.println(list.get(2));
//		System.out.println(list.length());
//		list.removeAtBegin();
//		System.out.println(list);
//		list.remove();
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		System.out.println(list.contains("Felipe"));
		
//		Stack<String> stack = new Stack<String>();
//		stack.push("Felipe");
//		stack.push("Yuri");
//		stack.push("Silva");
//		System.out.println(stack);
//		String t = stack.pop();
//		System.out.println(t);
//		System.out.println(stack);
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.length());
//		System.out.println(stack.getClass());
		
//		Queue<String> queue = new Queue<String>();
//		
//		queue.add("Rhaysa");
//		queue.add("Mateus");
//		queue.add("Tiago");
//		System.out.println(queue);
//		System.out.println(queue.length());
//		String t = queue.poll();
//		System.out.println(t);
		
//		Set<String> set = new Set<String>(); 
//		set.add("Felipe");
//		System.out.println(set);
//		set.add("Felipe");
//		set.add("Franca");
//		System.out.println(set);
//		set.add("Felipe");
//		set.add("Rhaysa");
//		set.add("Rhayka");
//		set.add("Vera");
//		set.add("Amarelo");
//		System.out.println(set);
//		set.remove("Rhayka");
//		System.out.println(set);
		
		BinaryTree<String> tree = new BinaryTree<String>();
//		System.out.println(tree.getRoot().toString());
		tree.insert("A");
		System.out.println(tree.getRoot().toString());
		tree.insert("B");
		System.out.println(tree.getRoot().toString());
		tree.insert("C");
		System.out.println(tree.getRoot().toString());
		
	}

}
