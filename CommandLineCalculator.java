import java.util.Scanner;

public class CommandLineCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String expr = "";
		int tkplace = 0;
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		boolean finished = true;
		char token = 'a';
		int exprlen = 0;

		// Input
		System.out.println("Please enter an expression (for ex -12.3/78):");
		expr = in.nextLine();
		System.out.println(expr);
		exprlen = expr.length();

		// Find mathematical operations' token position
		String tokens = "/*+-";
		for (int i = 0; i < (tokens.length()) & finished; i++) {
			token = tokens.charAt(i);
			tkplace = expr.indexOf(token, 1);
			if (tkplace > 0) {
				finished = !finished;
			}

		}
		// Create numbers from string and do calculations
		num1 = Double.parseDouble(expr.substring(0, tkplace));
		num2 = Double.parseDouble(expr.substring(tkplace + 1, exprlen));
		switch (token) {
		case '/':
			result = num1 / num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		default:
			break;
		}
		System.out.println("The result is: " + result);

	}
}
