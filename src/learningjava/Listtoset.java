package learningjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listtoset {

	public static void main(String[] args) {

		List<Object> ref = new ArrayList<>();
		ref.add("100");
		ref.add(100);
		ref.add("300");
		ref.add(300);
		ref.add(100);
		ref.add("100");

		System.out.println(ref);
		System.out.println("===================");

		Set<Object> l = new HashSet<>(ref);
		System.out.println(l);
		System.out.println("===================");

		Object[] n = ref.toArray();
		for (int a = 0; a < n.length; a++) {
			System.out.println(n[a]);
		}
		System.out.println("===================");

		Object[] m = l.toArray();
		for (int a = 0; a < m.length; a++) {
			System.out.println(m[a]);
		}
		System.out.println("===================");

	}

}
