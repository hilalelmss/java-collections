package list;

import java.util.Iterator;
import java.util.LinkedList;

public class IslemReverseLinkedList {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.add("Element4");
		System.out.println(list);

		Iterator<String> it = list.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
