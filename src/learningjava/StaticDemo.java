package learningjava;

public class StaticDemo {

	private void normalmethod() {
		System.out.println("Normal Method");
	}

	public static void staticmethod() {
		System.out.println("Static Method");
	}

	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {

		StaticDemo sd = new StaticDemo();
		StaticDemo.staticmethod();
		sd.normalmethod();
		System.out.println("Main Method");

	}

}
