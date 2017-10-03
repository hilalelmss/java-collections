package list;

import java.util.LinkedList;

public class IslemLinkedList {
	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();

		linkedlist.add("Tim");
		linkedlist.add("Rock");
		linkedlist.add("Hulk");
		linkedlist.add("Rock");
		linkedlist.add("James");
		linkedlist.add("Rock");
		linkedlist.add("James");
		linkedlist.add("Rock");
		linkedlist.add("James");
		linkedlist.add("Rock");

		// Searching first occurrence of element
		int firstIndex = linkedlist.indexOf("Rock");
		System.out.println("First: " + firstIndex);

		// Searching last occurrence of element
		int lastIndex = linkedlist.lastIndexOf("Rock");
		System.out.println("Last: " + lastIndex);
	}
}
