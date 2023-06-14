package learningjava;

import java.util.Scanner;

public class Armstrong {

	public static void armstrongNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scanner.nextInt();
		int n = num;
		int b = 0;

		while (num > 0) {
			int i = num % 10;
			b = b + (i * i * i);
			num = num / 10;
		}
		if (n == b) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}

	public static void main(String[] args) {

	}
}
