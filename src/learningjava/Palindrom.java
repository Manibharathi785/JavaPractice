package learningjava;

import java.util.Scanner;

public class Palindrom {

	public static Scanner s;

	public static void wordCheck() {
		s = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = s.next();
		String word2 = "";

		for (int a = word.length() - 1; a >= 0; a--) {
			word2 = word2 + word.charAt(a);
		}

		if (word.equalsIgnoreCase(word2)) {
			System.out.println(word + " is a Palindrome");
		} else {
			System.out.println(word + " is not a Palindrome");
		}
	}

	public static void numCheck() {
		System.out.println("Enter the num : ");
		int num = s.nextInt();
		int num2 = num;
		int rev = 0;

		while (num > 0) {
			rev = (rev * 10) + num % 10;
			num = num / 10;
		}

		if (num2 == rev) {
			System.out.println(num2 + " is a Palindrome");
		} else {
			System.out.println(num2 + " is not a Palindrome");
		}

	}

	public static void main(String[] args) {
		wordCheck();
		System.out.println("==========");
		numCheck();
	}
}
