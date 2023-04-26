package basic_java;

import java.util.Scanner;

public class PronounceInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		String sign = number>=0?"":"fu ";
		number = Math.abs(number);
		String pronounciation = "";
		do {
			int unitDigit = number%10;
			number /= 10;
			String unitPronounciation;
			switch (unitDigit) {
			case 1:
				unitPronounciation = "yi";
				break;
			case 2:
				unitPronounciation = "er";
				break;
			case 3:
				unitPronounciation = "san";
				break;
			case 4:
				unitPronounciation = "si";
				break;
			case 5:
				unitPronounciation = "wu";
				break;
			case 6:
				unitPronounciation = "liu";
				break;
			case 7:
				unitPronounciation = "qi";
				break;
			case 8:
				unitPronounciation = "ba";
				break;
			case 9:
				unitPronounciation = "jiu";
				break;
			default:
				unitPronounciation = "ling";
			}
			String space = (number==0)?"":" ";
			pronounciation = space + unitPronounciation + pronounciation;
			
		} while (number!=0);
		
		pronounciation = sign + pronounciation;
		
		System.out.println(pronounciation);
		
	}

}
