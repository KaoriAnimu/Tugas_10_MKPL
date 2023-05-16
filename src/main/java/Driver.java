import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println("Count:" + counter.getCount1());
		counter.increment();
		System.out.println("Count:" + counter.getCount2());
		counter.decrement();
		System.out.println("Count:" + counter.getCount3());
	}

}
