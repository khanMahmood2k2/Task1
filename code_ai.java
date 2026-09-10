import java.util.Scanner;

public class code_ai {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a word or phrase: ");
		String input = scanner.nextLine().trim();

		if (input.isEmpty()) {
			System.out.println("Please enter a word or phrase.");
		} else if (isPalindrome(input)) {
			System.out.println("Yes, it is a palindrome!");
		} else {
			System.out.println("No, it is not a palindrome.");
		}

		scanner.close();
	}

	private static boolean isPalindrome(String input) {
		String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reversed = new StringBuilder(normalized).reverse().toString();
		return !normalized.isEmpty() && normalized.equals(reversed);
	}
}
