package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IslemLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("hash", 3);
		linkedHashMap.put("map", 6);
		linkedHashMap.put("linked", 1);
		System.out.println(linkedHashMap);

		Set set = linkedHashMap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.println(me.getKey() + ":" + me.getValue());

		}

	}

}
