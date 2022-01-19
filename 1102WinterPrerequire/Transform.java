import java.util.Scanner;

public class Transform {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float miles;
		float kilometers;

		miles = input.nextFloat();
		kilometers = miles * 1.6f;
		System.out.printf("%.2f\n", kilometers);
	}
}