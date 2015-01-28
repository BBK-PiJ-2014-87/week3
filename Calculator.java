import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		String undefined = "";
		// Input
		System.out.println("Please enter first number:");
		num1 = sc.nextDouble();
		System.out.println("Please enter second number:");
		num2 = sc.nextDouble();
		
		System.out.println("Please choose form the menu:\n" + "1. Add\n"
				+ "2. Substract\n" + "3. Multiply\n" + "4. Devide");
		int choice = sc.nextInt();
		//Output calculations
		switch (choice) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		default:
			undefined = "Wrong operation";
			break;

		}
		System.out.println("The result is:" + result + undefined);

	}

}
