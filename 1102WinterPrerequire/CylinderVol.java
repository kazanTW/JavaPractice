import java.util.Scanner;

@SuppressWarnings("resource")
public class CylinderVol {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double radius, height, volume;

		radius = input.nextDouble();
		height = input.nextDouble();

		volume = Math.PI * radius * radius * height;
		System.out.printf(String.valueOf(volume) + "\n");
	}
}