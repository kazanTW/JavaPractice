import java.util.Scanner;

@SuppressWarnings("resource")
public class StringCut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String string;
		String token;
		String[] result;

		string = input.next();
		token = input.next();


		result = string.split(token);
		for(String tokens:result) {
			System.out.println(tokens);
		}
	}
}