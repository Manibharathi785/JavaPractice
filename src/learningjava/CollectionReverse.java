package learningjava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionReverse {

	public static void main(String[] args) {

		List<Object> x = new ArrayList<Object>();

		x.add("Mani");
		x.add("Azeem");
		x.add("Deepan");
		x.add("Neeraj");
		x.add(5000);
		x.add("Mani");

		System.out.println(x);
		System.out.println("           ");

		ListIterator<Object> abc = x.listIterator();
		while (abc.hasNext()) {
			Object xyz = abc.next();
			System.out.println(xyz);

		}

		System.out.println("           ");

		while (abc.hasPrevious()) {
			Object zyx = abc.previous();
			System.out.println(zyx);
		}
	}

}
