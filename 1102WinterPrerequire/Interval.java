import java.util.Scanner;

@SuppressWarnings("resource")
public class Interval {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y;
		x = input.nextInt();
		y = formula(x);
		System.out.printf("%d\n", y);

	}

	private static int formula(int x) {
		int y;
		if(x < -1) {
			y = x * x * 3;
		} else {
			if(x > 1) {
				y = x * 2 + 3;
			} else {
				y = x * x * x + x * 3 - 3;
			}
		}

		return y;
	}
}