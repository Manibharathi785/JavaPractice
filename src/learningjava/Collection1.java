package learningjava;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collection1 {

	public static void main(String[] args) {

		Map<Object, Object> mp = new LinkedHashMap<Object, Object>();
		mp.put(1.1, "mani");
		mp.put(20.2, "deepan");
		mp.put(0.3, "badri");
		mp.put(4.2585641556636, "kisore");
		mp.put('@', "neeraj");
		mp.put(1.055566, "azeem");

		Map<Integer, Integer> ap = new TreeMap<Integer, Integer>();
		ap.put(1, 1);
		ap.put(2, 22);
		ap.put(3, 333);
		ap.put(4, 4444);
		ap.put(5, 55555);
		ap.put(6, 123456);

		System.out.println(mp);
		System.out.println(ap);

		int a = mp.size();
		System.out.println(a);

		Object b = mp.get(1.1);
		System.out.println(b);

		Set<Object> c = mp.keySet();
		System.out.println(c);

		Collection<Object> d = mp.values();
		System.out.println(d);

		boolean e = mp.containsKey(2);
		System.out.println(e);

		boolean f = mp.containsValue("mani");
		System.out.println(f);

		Set<Entry<Object, Object>> g = mp.entrySet();
		System.out.println(g);
		
		mp.putAll(ap);
		System.out.println(mp);
		
	}

}
