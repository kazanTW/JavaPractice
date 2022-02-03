import java.util.Scanner;

@SuppressWarnings("resource")
public class Leap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		if((year % 4) == 0) {
			if((year % 100) != 0) {
				System.out.println("Leap Year");
			} else {
				if((year % 400) == 0) {
					System.out.println("Leap Year");
				} else {
					System.out.println("Common Year");
				}
			}
		} else {
			System.out.println("Common Year");
		}
	}
}