package learningjava;

import java.util.Scanner;

public class ReverseString {

	public static Scanner input;

	public static void stringRev() {
		System.out.print("Enter the Word : ");
		input = new Scanner(System.in);
		String word = input.next();
		int a = 0;
		int b = word.length() - 1;
		String rev = "";
		while (a <= b) {
			rev = rev + word.charAt(b);
			b--;
		}
		System.out.println(rev);
	}

	public static void revByWord() {
		System.out.println("Enter the String : ");
		input = new Scanner(System.in);
		String word = input.next();
		String[] split = word.split(" ");
		String revString = "";
		for (String x : split) {
			System.out.println(x);
			String revWord = "";
			for (int i = x.length() - 1; i >= 0; i--) {
				revWord = revWord + x.charAt(i);
			}
			revString = revString + revWord + " ";
		}
		System.out.println("Reversed String = " + revString);
	}

	public static void main(String[] args) {
		stringRev();
		System.out.println("=====================");
		revByWord();
	}
}
