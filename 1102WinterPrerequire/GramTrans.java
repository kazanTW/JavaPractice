import java.util.Scanner;

@SuppressWarnings("resource")
public class GramTrans {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double gram, jing;
		gram = input.nextDouble();
		jing = gram / 600.0;
		System.out.printf("%.1f\n", jing);
	}
}