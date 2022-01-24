import java.util.Scanner;
import java.util.regex.Pattern;

@SuppressWarnings("resource")
public class StringCut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String string;
		String token;
		String[] result;

		string = input.next();
		token = input.next();


		result = string.split(Pattern.quote(token));
		for(String tokens:result) {
			if(tokens != " ")
				System.out.println(tokens);
		}
	}
}