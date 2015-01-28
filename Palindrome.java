import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "";
		String newWord = "";
		boolean answer = true;

		System.out.println("Please enter word to check:");
		word = sc.nextLine();

		for (int i = word.length() - 1; i >= 0 & answer; i--) {
			int a = word.length() - (i + 1);
			System.out
					.println("i: " + word.charAt(i) + " a: " + word.charAt(a));
			if (word.charAt(i) != word.charAt(a)) {
				answer = !answer;
				break;
			}
		}

		if (answer) {
			System.out.println("The word is a palindrome!");
		} else {
			System.out.println("The word is NOT a palindrome!");

		}

	}

}
