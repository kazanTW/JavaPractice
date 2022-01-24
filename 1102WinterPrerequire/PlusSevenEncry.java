import java.util.Scanner;

@SuppressWarnings("resource")
public class PlusSevenEncry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int plain, cipher;
		plain = input.nextInt();

		cipher = plusSevenEncry(plain);
		System.out.printf("%04d\n", cipher);
	}
	public static int plusSevenEncry(int plain) {
		int cipher;
		int a, b, c, d;
		d = plain % 10;
		c = (plain - d) / 10 % 10;
		b = (plain - d - c * 10) / 100 % 10;
		a = (plain - d - c * 10 - b * 100) / 1000 % 10;
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		cipher = c * 1000 + d * 100 + a * 10 + b;

		return cipher;
	}
}