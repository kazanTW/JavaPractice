import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		int number1, number2;
		int sum, difference, product, reminder;
		float quotient;

		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();

		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		quotient = (float)number1 / number2;
		reminder = number1 % number2;

		System.out.printf("%d\n%d\n%d\n%.2f\n%d\n", sum, difference, product, quotient, reminder);
	}
}