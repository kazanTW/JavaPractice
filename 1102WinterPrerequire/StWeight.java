import java.util.Scanner;

@SuppressWarnings("resource")
public class StWeight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int height, gender;
		double weight;

		height = input.nextInt();
		gender = input.nextInt();

		weight = standardWeight(height, gender);
		System.out.printf("%.1f\n", weight);
	}

	private static double standardWeight(int height, int gender) {
		double stWeight;

		if(gender == 1) {
			stWeight = (height - 80) * 0.7;
		} else {
			if(gender == 2) {
				stWeight = (height - 70) * 0.6;
			}
		}

		return stWeight;
	}
}
