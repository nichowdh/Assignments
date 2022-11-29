import java.util.ArrayList;

public class ListLoader implements Runnable { // class
	int startNumber, lastNumber;

	ListLoader(int sn, int ln) { // parameterised constructor
		this.startNumber = sn;
		this.lastNumber = ln;
	}

	public void run() { // method of (loadlist)
		ArrayList<Integer> a = new ArrayList<Integer>(); // array integer
		for (Integer i = startNumber; i < lastNumber; i++) { // for loop
			a.add(i);

		}
		for (int j : a) { // for loop
			System.out.println(j);
		}

	}

}
