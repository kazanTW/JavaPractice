import java.util.Scanner;

@SuppressWarnings("resource")
public class Season {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int month;
		month = input.nextInt();
		season(month);
	}

	private static void season(int month) {
		if(month == 12 || month == 1 || month == 2) {
			System.out.println("Winter");
		} else {
			if(3 <= month && month <= 5) {
				System.out.println("Spring");
			} else {
				if(6 <= month && month <= 8) {
					System.out.println("Summer");
				} else {
					if(9 <= month && month <= 11) {
						System.out.println("Autumn");
					}
				}
			}
		}
	}
}