package list;

import java.util.LinkedList;

public class IslemListAddList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Hilal");
		list.add("Hilal2");
		list.add("Hilal3");
		System.out.println(list);

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Elmas");
		list2.add("Elmas2");
		list2.add("Elmas3");
		System.out.println(list2);

		list.addAll(list2);
			System.out.println(list);
	}

}
