import java.util.Scanner;

@SuppressWarnings("resource")
public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if(a <= b && b <= c) {
			triangle(a, b, c);
		} else {
			System.out.println("False");
		}
	}

	private static void triangle(int a, int b, int c) {
		if(a + b > c) {
			if(b + c > a) {
				if(c + a > b) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			} else {
				System.out.println("False");
			}
		} else {
			System.out.println("False");
		}
	}
}