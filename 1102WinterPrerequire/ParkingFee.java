import java.util.Scanner;

@SuppressWarnings("resource")
public class ParkingFee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hrEnter, minEnter, hrLeave, minLeave;
		int parkingFee;

		hrEnter = input.nextInt();
		minEnter = input.nextInt();
		hrLeave = input.nextInt();
		minLeave = input.nextInt();

		parkingFee = fee(hrEnter, minEnter, hrLeave, minLeave);
		System.out.printf("%d\n", parkingFee);
	}

	private static int fee(int hrEnter, int minEnter, int hrLeave, int minLeave) {
		int parkingFee = 0;

		if(minEnter > minLeave) {
			hrLeave -= 1;
			minLeave += 60;
		}

		int parkingTotal = (hrLeave - hrEnter) * 60 + (minLeave - minEnter);

		if(parkingTotal < 120) {
			parkingFee += (parkingTotal / 30) * 30;
		} else {
			if(parkingTotal >= 120 && parkingTotal < 240) {
				parkingFee += ((parkingTotal - 120) / 30) * 40 + 120;
			} else {
				parkingFee += ((parkingTotal - 240) / 30) * 60 + 280;
			}
		}

		return parkingFee;
	}
}