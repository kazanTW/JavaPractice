import java.util.Scanner;

@SuppressWarnings("resource")
public class Zodiac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month, day;
		month = input.nextInt();
		day = input.nextInt();

		zodiac(month, day);
	}

	private static void zodiac(int month, int day) {
		switch(month) {
			case 1: 
				if(day >= 21) {
					sign("Aquarius");
				} else {
					sign("Capricorn");
				}
				break;
			case 2:
				if(day <= 18) {
					sign("Aquarius");
				} else {
					sign("Pisces");
				}
				break;
			case 3:
				if(day <= 20) {
					sign("Pisces");
				} else {
					sign("Aries");
				}
				break;
			case 4:
				if(day <= 20) {
					sign("Aries");
				} else {
					sign("Taurus");
				}
				break;
			case 5: 
				if(day <= 21) {
					sign("Taurus");
				} else {
					sign("Gemini");
				}
				break;
			case 6:
				if(day <= 21) {
					sign("Gemini");
				} else {
					sign("Cancer");
				}
				break;
			case 7:
				if(day <= 22) {
					sign("Cancer");
				} else {
					sign("Leo");
				}
				break;
			case 8: 
				if(day <= 23) {
					sign("Leo");
				} else {
					sign("Virgo");
				}
				break;
			case 9:
				if(day <= 23) {
					sign("Virgo");
				} else {
					sign("Libra");
				}
				break;
			case 10:
				if(day <= 23) {
					sign("Libra");
				} else {
					sign("Scorpio");
				}
				break;
			case 11:
				if(day <= 22) {
					sign("Scorpio");
				} else {
					sign("Sagittarius");
				}
				break;
			case 12:
				if(day <= 21) {
					sign("Sagittarius");
				} else {
					sign("Capricorn");
				}
				break;
		}
	}

	private static void sign(String type) {
		System.out.println(type);
	}
}