package reidai;

public class Uru {
	public static void printLeapYear(final int year) {
		boolean isLeapYear = false;
		if(year % 4 == 0) {
			if((year % 100) == 0 ) {
				isLeapYear = ((year % 400) == 0);
			}else {
					isLeapYear = true;
				}
			}
		System.out.println(year +"年はうるう年"+(isLeapYear ?"です":"ではありません"));
		}
	}


