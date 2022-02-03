import java.util.Scanner;

@SuppressWarnings("resource")
public class TriType {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if(a <= b && b <= c) {
			type(a, b, c);
		} else {
			System.out.println("False");
		}
	}

	private static void type(int a, int b, int c) {
		if(a * a + b * b == c * c) {
			System.out.println("Right triangle");
		} else {
			if(a * a + b * b > c * c) {
				System.out.println("Acute triangle");
			} else {
				System.out.println("Obtuse triangle");
			}
		}
	}
}