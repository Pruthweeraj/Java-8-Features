package collectionWithLambds;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap  = new TreeMap<>((i1 , i2) -> (i1 > i2)?-1 : (i1 < i2)?+1 : 0);
		treeMap.put(14, "Sagar");
		treeMap.put(12, "pr");
		treeMap.put(27, "pupa");
		treeMap.put(4, "kunu");
		treeMap.put(8, "lulu");
		System.out.println(treeMap);
	}
}
