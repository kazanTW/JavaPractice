import java.util.Scanner;

@SuppressWarnings("resource")
public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		x = input.nextInt();
		y = input.nextInt();

		circle(x, y);
	}

	private static void circle(int x, int y) {
		if((x * x + y * y) > 10000) {
			System.out.println("outside");
		} else {
			System.out.println("inside");
		}
	}
}