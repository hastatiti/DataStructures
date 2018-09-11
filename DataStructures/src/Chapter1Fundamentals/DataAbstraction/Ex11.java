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

	public static boolean isValidDate(int m, int d, int y) {
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leapDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(m < 1 || m > 12 || y < 1 || d < 1 || d > 31 || d > days[m-1]) return false;
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
		Ex11 date = new Ex11(40,40,40);
		System.out.println(date);
	}
}
