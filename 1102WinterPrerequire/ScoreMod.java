import java.util.Scanner;

@SuppressWarnings("resource")
public class ScoreMod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scoreOriginal;
		int scoreNew;

		scoreOriginal = input.nextInt();
		scoreNew = (int)scoreModify(scoreOriginal);
		System.out.printf("%d\n", scoreNew);
	}

	private static double scoreModify(int score) {
		double scoreModified;
		scoreModified = java.lang.Math.sqrt((double)score) * 10;

		return scoreModified;
	}
}