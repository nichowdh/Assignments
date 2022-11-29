
public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		Runnable r = new ListLoader(0, 50); // object creatio of Runnable with value
		Thread t = new Thread(r); // object of Thread Class

		Runnable r1 = new ListLoader(50, 100);
		Thread t1 = new Thread(r1);

		int a = (int) System.currentTimeMillis(); // time taken before executing
		System.out.println("Response time before Executing LoadList Method: " + a);

		t.start();
		t1.start();
		t.join();
		t1.join();

		int b = (int) System.currentTimeMillis();
		System.out.println("Response time after Executing LoadList Method: " + b);
		System.out.println("Response Time: " + (b - a) + " ms");

	}

}
