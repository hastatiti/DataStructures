package Chapter1Fundamentals.DataAbstraction;

public class Ex19 {
	private final int month;
	private final int day;
	private final int year;


	public Ex19(String date) {
		String[] fields = date.split("/");
		day = Integer.parseInt(fields[0]);
		month = Integer.parseInt(fields[1]);
		year = Integer.parseInt(fields[2]);
		if (!(isValidDate(day, month, year)))
			throw new RuntimeException("not a valid date");
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
	@Override
	public String toString() {
		return  month + "/"  + day + "/"  + year ;
	}
	public static void main(String[] args) {
		Ex19 date = new Ex19("1/2/2002");
		System.out.println(date);
	}
}
