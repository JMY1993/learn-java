package basic_java;

import java.util.Scanner;

public class GPSParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String GPSinput = "";
		String prevLn = "";
		//处理输入
		while(!prevLn.equals("END")) {
			GPSinput+=prevLn;
			prevLn = in.nextLine();
		}
		
		int indexOfsID = -1;
		int hms = 0;
		
		while(true) {
			int index = GPSinput.indexOf("$GPRMC", indexOfsID+1);
			if (index== -1) { //如果已经处理完最后一组GPRMC，结束循环
				break;
			} else {
				indexOfsID = index;
				//从$开始，一直循环到*
				for ( int i = indexOfsID+1, checksum=0; GPSinput.charAt(i) != '*'; i++ ) {
					if ( GPSinput.charAt(i+1) == '*' ) { //如果到了*，做校验
						//校验成功后，判断是否已经定位：
						if ( checksum == Integer.parseInt(GPSinput.substring(i+2, i+4), 16)) {
							boolean isPositioned = false;
							for ( int j = indexOfsID, cnt = 0; cnt < 2; j++ ) {
								if (GPSinput.charAt(j) == ',') {
									cnt ++;
								}
								
								if ( cnt == 2 ) {
									isPositioned = (GPSinput.charAt(j+1)=='A');
								}
							}
							if (!isPositioned) break;
							for ( int j = indexOfsID, cnt = 0; cnt < 1; j++ ) {
								if (GPSinput.charAt(j) == ',') {
									cnt ++;
								}
								
								if ( cnt == 1 ) {

									hms = Integer.parseInt(GPSinput.substring(j+1, j+7));
									break;
								}
							}
						}
					} else { //在到达*之前，计算校验值
						if (i == indexOfsID+1) {
							checksum = GPSinput.charAt(i) ^ GPSinput.charAt(i+1);
						} else {
							checksum = checksum ^ GPSinput.charAt(i+1);
						}
					}
				}
			}
		}
		
		String result = "";
		for (int i = 0; i < 3; i++) {
			int digit_number = hms%100;
			
			if ( i == 2 ) {
				digit_number += 8;
				if ( digit_number >= 24 ) {
					digit_number -= 24;
				}
			}
			
			String digit = ""+digit_number;
			if (digit.length()<2) digit="0"+digit;
			String colon = ":";
			if (i == 2) colon = "";
			result = colon + digit + result;
			hms /= 100;
		}
		
		System.out.println(result);
		
	}

}
