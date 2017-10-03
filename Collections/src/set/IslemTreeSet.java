package set;

import java.util.Iterator;
import java.util.TreeSet;

public class IslemTreeSet {
	public static void main(String[] args) {
		//artan sýrayla sýralar
		TreeSet<String> tlist = new TreeSet<>();
		tlist.add("DEF");
		tlist.add("BCD");
		tlist.add("ABC");
		tlist.add("CDE");
		System.out.println(tlist);

		Iterator<String> it = tlist.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}
