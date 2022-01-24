import java.util.Scanner;

@SuppressWarnings("resource")
public class BodyTrans {
	public static void main(String[] args) {
		int cm, kg;
		double inch, pound;

		Scanner input = new Scanner(System.in);

		cm = input.nextInt();
		kg = input.nextInt();

		inch = cm / 2.54;
		pound = kg / 0.454;

		System.out.printf("%.4f\n%.4f\n", inch, pound);
	}
}