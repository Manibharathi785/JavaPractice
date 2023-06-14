package learningjava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collection2 {

	public static void main(String[] args) {

		List<Object> a = new ArrayList<Object>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add("Mani");

		Set<Object> st = new LinkedHashSet<Object>();
		st.add("Badri");
		st.add("Azeem");
		st.add("Neeraj");
		st.add("kishore");
		st.add(500);

		System.out.println(a);
		System.out.println(st);

		int aa = a.size();
		System.out.println(aa);
		
		Object ab = a.get(4);
		System.out.println(ab);
		
		a.remove(1);
		System.out.println(a);
		
		a.set(0, "Deepan");
		System.out.println(a);
		
		int ae = a.indexOf(400);
		System.out.println(ae);
		
		boolean af = a.contains("Mani");
		System.out.println(af);
		
		a.clear();
		System.out.println(a);

		a.addAll(st);
		System.out.println(a);
		
		a.removeAll(a);
		System.out.println(a);
		
		a.retainAll(st);
		System.out.println(a);
	}

}
