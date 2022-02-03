import java.util.Scanner;

@SuppressWarnings("resource")
public class Alphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char target = input.next().charAt(0);

		if(!(Character.isLowerCase(target))) {
			if(Character.isUpperCase(target)) {
				System.out.println("uppercase");
			} else {
				System.out.println("special character");
			}
		} else {
			System.out.println("lowercase");
		}
	}
}