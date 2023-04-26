package basic_java;

import java.util.Scanner;

public class CountAllLettersInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int number = 0;
		String result = "";
		
		for ( int i = 0; i < s.length(); i++ ) {
			if ( s.charAt(i) == '.' && i == s.lastIndexOf('.') ) {
				result = result + (result.equals("")?"":" ") + number;
				break;
			} else if ( s.charAt(i) ==  ' ') {
				if ( number != 0 ) {
					result = result + (result.equals("")?"":" ") + number;
					number = 0;
				}
			} else {
				number++;
			}
		}
		
		System.out.println(result);	
	}

}
