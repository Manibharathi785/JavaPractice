package learningjava;

public class ForLoop {

	public static void main(String[] args) {
		for (int a = 1; a <= 3; a++) {

			for (int s = 2; s <= a; s++) {
				System.out.print(" ");
			}

			for (int b = a; b <= 3; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
