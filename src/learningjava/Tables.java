package learningjava;

import java.util.Scanner;

public class Tables {

	public static Scanner s;

	public static void tables() {
		s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		System.out.print("Enter the Number Count : ");
		int count = s.nextInt();

		for (int c = 1; c <= count; c++) {

			int num1 = num * c;

			System.out.println(num + " * " + c + " = " + num1);

		}

	}

	public static void main(String[] args) {
		tables();
	}
}