import java.util.Scanner;

@SuppressWarnings("resource")
public class FormatArith {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		System.out.printf("%d+%d=%d\n", number1, number2, number1 + number2);
		System.out.printf("%d*%d=%d\n", number1, number2, number1 * number2);
		System.out.printf("%d-%d=%d\n", number1, number2, number1 - number2);
		System.out.printf("%d/%d=%d...%d\n", number1, number2, number1 / number2, number1 % number2);
	}
}