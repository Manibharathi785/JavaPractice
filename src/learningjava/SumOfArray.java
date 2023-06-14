package learningjava;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int array[] = { 0, 1, 2, 4, 5, 8, 10, 4, 3, 14, 12, 7 };
		System.out.println("Enter the sum of number = ");
		int sum = s.nextInt();

		for (int a = 0; a < array.length; a++) {

			for (int b = a + 1; b < array.length; b++) {

				if (array[a] + array[b] == sum) {
					System.out.println("Pair of Numbers : { " + array[a] + " , " + array[b] + " }");
				}
			}
		}

	}

}
