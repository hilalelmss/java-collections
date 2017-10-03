package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IslemHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(8, "den");
		map.put(3, "dene");
		map.put(6, "denem");
		map.put(1, "deneme");
		map.put(1, "denee");
		map.put(10, "deneme");
		map.put(9, "deneme");
		map.put(22, "deneme");
		map.put(0, "deneme");
		System.out.println(map);

		// entrySet() metodu Map'in key-value çiftlerini verir
		Set set = map.entrySet();
		// iterator() metodu Map'in öðelerini tarar;
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			HashMap.Entry hashentry = (HashMap.Entry) iterator.next();
			System.out.println("key:" + hashentry.getKey() + "-Value: " + hashentry.getValue());
		}
		// containsKey(),key varsa true yoksa false
		boolean control = map.containsKey(22);
		System.out.println(control);
		control = map.containsKey(11);
		System.out.println(control);
		// containsValue(),value varsa true yoksa false
		boolean controlValue = map.containsValue("dene");
		System.out.println(controlValue);
	}
}
