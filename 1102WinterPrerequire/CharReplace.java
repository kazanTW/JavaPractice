import java.util.Scanner;

@SuppressWarnings("resource")
public class CharReplace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		char target, replacement;
		str = input.nextLine();
		target = input.next().charAt(0);
		replacement = input.next().charAt(0);
		System.out.println(str.replace(target, replacement));
	}
}