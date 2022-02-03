import java.util.Scanner;
import java.lang.*;

@SuppressWarnings("resource")
public class AlphaTrans {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);

		if(Character.isUpperCase(ch)) {
			ch = Character.toLowerCase(ch);
			System.out.println(ch);
		} else {
			if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				System.out.println(ch);
			}
		}
	}
}