import java.util.Scanner;

@SuppressWarnings("resource")
public class PowerFee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int degree = input.nextInt();
		double fee;
		System.out.printf("%.2f\n%.2f\n", summerFee(degree), notSummerFee(degree));
	}

	private static double summerFee(int degree) {
		double powerFee = 0;

		if(degree <= 120) {
			powerFee += degree * 2.10;
		} 
		else {
			if(degree <= 330) {
				powerFee += (degree - 120) * 3.02 + 252.00;
			} 
			else {
				if(degree <= 500) {
					powerFee += (degree - 330) * 4.39 + 634.20 + 252.00;
				} 
				else {
					if(degree <= 700) {
						powerFee += (degree - 500) * 4.97 + 746.30 + 634.20 + 252.00;
					} 
					else {
						powerFee += (degree - 700) * 5.63 + 994.00 + 746.30 + 634.20 + 252.00;
					}
				}	
			}
		}

		return powerFee;
	}

	private static double notSummerFee(int degree) {
		double powerFee = 0;

		if(degree <= 120) {
			powerFee += degree * 2.10;
		} 
		else {
			if(degree <= 330) {
				powerFee += (degree - 120) * 2.68 + 252.00;
			} 
			else {
				if(degree <= 500) {
					powerFee += (degree - 330) * 3.61 + 562.80 + 252.00;
				} 
				else {
					if(degree <= 700) {
						powerFee += (degree - 500) * 4.01 + 613.70 + 562.80 + 252.00;
					} 
					else {
						powerFee += (degree - 700) * 4.50 + 802.00 + 613.70 + 562.80 + 252.00;
					}
				}	
			}
		}
		return powerFee;
	}
}