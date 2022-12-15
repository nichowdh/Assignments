package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {

	private HashMap<String, String> M1;

	public CountryMap() {
		M1 = new HashMap<String, String>();
	}

	public HashMap<String, String> storeCountryCapital(String CountryName, String capital) { // 1st method
		M1.put(CountryName, capital);
		return M1;

	}

	public String retriveCapital(String CountryName) { // second method

		return M1.get(CountryName);
	}

	public String retriveCountry(String capitalName) { // 3rd method
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		return null;

	}

	public HashMap<String, String> swapKeyValue() { // fourth method
		HashMap<String, String> M2 = new HashMap<String, String>();
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}

	public ArrayList<String> toArrayList() { // 5th method
		ArrayList<String> list = new ArrayList<>();

		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}

		return list;
	}

	public static void main(String[] args) { // main method
		// creating object of Country class
		CountryMap cMap = new CountryMap();
		// passing the values
		System.out.println(cMap.storeCountryCapital("India", "Delhi"));
		System.out.println(cMap.storeCountryCapital("Japan", "Tokyo"));
		System.out.println(cMap.storeCountryCapital("USA", "Washington"));
		System.out.println(cMap.storeCountryCapital("Paris", "London"));

		System.out.println(cMap.retriveCapital("India"));
		System.out.println(cMap.retriveCountry("Tokyo"));

		HashMap<String, String> M2 = cMap.swapKeyValue();
		System.out.println(M2);

	}

}
