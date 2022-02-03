import java.util.Scanner;

@SuppressWarnings("resource")
public class Price {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int price;
		String priceStr = "";

		price = input.nextInt();
		Integer thousand, hundred, ten, one;
		thousand = price / 1000;
		hundred = price % 1000 / 100;
		ten = price % 1000 % 100 / 10;
		one = price % 1000 % 100 % 10 ;

		if(thousand != 0) {
			priceStr = thousand.toString() + " thousand " + hundred.toString() + " hundred " + ten.toString() + " ten " + one.toString() + " dollar";
		} else {
			if(hundred != 0) {
				priceStr = hundred.toString() + " hundred " + ten.toString() + " ten " + one.toString() + " dollar";
			} else {
				if (ten != 0) {
					priceStr = ten.toString() + " ten " + one.toString() + " dollar";
				} else {
					priceStr = one.toString() + " dollar";
				}
			}
		}
		System.out.println(priceStr);		 
	}
}