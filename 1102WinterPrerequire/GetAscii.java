import java.util.Scanner;

@SuppressWarnings("resource")
public class GetAscii {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char ch;
		int code;

		ch = input.nextLine().charAt(0);
		code = (int)ch;

		System.out.printf("%d\n", code);
	}
}