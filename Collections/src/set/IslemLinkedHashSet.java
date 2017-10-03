package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IslemLinkedHashSet {
	public static void main(String[] args) {
		// eklenme sırasına göre sıralar
		LinkedHashSet<Integer> hashlist = new LinkedHashSet<>();
		hashlist.add(17);
		hashlist.add(10);
		hashlist.add(1);
		hashlist.add(15);
		hashlist.add(186);
		hashlist.add(235);
		hashlist.add(170);
		System.out.println(hashlist);

		TreeSet<Integer> tlist = new TreeSet<>(hashlist);
		System.out.println(tlist);
	}
}
