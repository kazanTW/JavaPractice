import java.util.Scanner;

@SuppressWarnings("resource")
public class Charge {
	public static void main(String[] args) {
		int n;
		int a1, a2, a3;

		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		a1 = input.nextInt();
		a2 = input.nextInt();
		a3 = input.nextInt();

		charge(n, a1, a2, a3);
	}

	private static void charge(int n, int a1, int a2, int a3) {
		int chargeTotal, c1, c2, c3;
		
		if((a1 * 15 + a2 * 20 + a3 * 30) > n) {
			System.out.println("0");
		} else {
			chargeTotal = n - a1 * 15 - a2 * 20 - a3 * 30;
			c3 = chargeTotal / 50;
			c2 = (chargeTotal % 50) / 5;
			c1 = (chargeTotal % 50) % 5;

			System.out.printf("%d\n%d\n%d\n", c1, c2, c3);
		}
	}
}