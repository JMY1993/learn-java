package basic_java;

import java.util.Scanner;

public class RSReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int rs = in.nextInt();
		int r = rs/10;
		int s = rs%10;
		
		String rReport = "";
		String sReport = "";
		switch (r) {
		case 1:
			rReport = "unreadable";
			break;
		case 2:
			rReport = "barely readable, occasional words distinguishable";
			break;
		case 3:
			rReport = "readable with considerable difficulty";
			break;
		case 4:
			rReport = "readable with practically no difficulty";
			break;
		case 5:
			rReport = "perfectly readable";
			break;
		}
		
		switch (s) {
		case 1:
			sReport = "Faint signals, barely perceptible";
			break;
		case 2:
			sReport = "Very weak signals";
			break;
		case 3:
			sReport = "Weak signals";
			break;
		case 4:
			sReport = "Fair signals";
			break;
		case 5:
			sReport = "Fairly good signals";
			break;
		case 6:
			sReport = "Good signals";
			break;
		case 7:
			sReport = "Moderately strong signals";
			break;
		case 8:
			sReport = "Strong signals";
			break;
		case 9:
			sReport = "Extremely strong signals";
			break;
		}
		
		System.out.println(sReport+", "+rReport+".");
	}

}
