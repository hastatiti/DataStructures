package Chapter1Fundamentals.DataAbstraction;

public class Ex11 {
	private final int month;
	private final int day;
	private final int year;

	public Ex11(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public int month() {
		return month;
	}

	public int day() {
		return day;
	}

	public int year() {
		return year;
	}

	public static boolean isValidDate(int d, int m, int y) {
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leapDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(m < 1 || m > 12 || y < 1 || d < 1 || d > 31 || d > days[m-1]) 
			{throw new RuntimeException("invalid day");
			}
		System.out.println("valid date");
		return true;
	}
	
	public static boolean isLeapYear(int y) {
		if (y % 4 != 0) {
		    return false;
		  } else if (y % 400 == 0) {
		    return true;
		  } else if (y % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
	}
	public String toString()
	{return month() + "/" + day() + "/" + year();}
	public static void main(String[] args) {
		//isValidDate(29,2,2011);
		isValidDate(28,2,2011);
		if(isLeapYear(2020)) {
			System.out.println("It is leap year");
		}else System.out.println("Not a leap year");
	}
}
