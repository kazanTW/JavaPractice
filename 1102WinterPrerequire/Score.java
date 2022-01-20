import java.util.Scanner;

@SuppressWarnings("resource")
public class Score {
	public static void main(String[] args) {
		int chinese, english, mathematic;
		int sum, average;

		Scanner input = new Scanner(System.in);
		chinese = input.nextInt();
		english = input.nextInt();
		mathematic = input.nextInt();

		sum = chinese + english + mathematic;
		average = sum / 3;

		System.out.printf("%d\n%d\n", sum, average);
	}
}