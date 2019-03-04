package collectionWithLambds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(2);
		treeSet.add(10);

		System.out.println("Before shorting :" + treeSet);
		
		TreeSet<Integer> treeSet2 = new TreeSet<>((i1 , i2) -> (i1 > i2)?-1 : (i1 < i2)?+1 : 0);
		treeSet2.add(10);
		treeSet2.add(50);
		treeSet2.add(2);
		treeSet2.add(10);
		System.out.println("Shorting according to customized Shoting order:" + treeSet2);
	}

}
