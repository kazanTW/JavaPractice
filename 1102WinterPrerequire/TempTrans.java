import java.util.Scanner;

@SuppressWarnings("resource")
public class TempTrans {
	public static void main(String[] args) {
		float tempC;	// Declare C Temperature
		float tempF;	// Declare F Temperature

		Scanner input = new Scanner(System.in);

		tempC = input.nextFloat();
		tempF = tempC * 9 / 5 + 32;

		System.out.printf("%.2f\n", tempF); 
	}
}