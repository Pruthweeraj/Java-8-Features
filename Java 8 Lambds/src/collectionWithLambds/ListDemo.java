package collectionWithLambds;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(50);
		arrayList.add(2);
		arrayList.add(10);

		System.out.println("Before shorting :" + arrayList);

		Collections.sort(arrayList);
		System.out.println("Shorting according to default Shoting order:" + arrayList);

		Collections.sort(arrayList, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
		System.out.println("Shorting according to customized Shoting order:" + arrayList);

	}
}
