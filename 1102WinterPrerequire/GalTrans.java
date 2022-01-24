import java.util.Scanner;

@SuppressWarnings("resource")
public class GalTrans {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double literal, gallon;
		literal = input.nextDouble();
		gallon = literal * 0.26418;
		System.out.printf("%.1f\n", gallon);
	}
}