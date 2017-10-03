package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class IslemHashSet {
	public static void main(String args[]) {
		// sýralama algoritmesý yok
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pear");
		System.out.println(fruits);

		List<String> fruitList = new ArrayList<String>(fruits);
		// fruitList.addAll(fruits);
		Collections.sort(fruitList);
		System.out.println("Method 1:" + fruitList);

		TreeSet<String> tset = new TreeSet<String>(fruits);
		System.out.println("Method 2:" + tset);
	}
}
