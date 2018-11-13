package Chapter1Fundamentals.DataAbstraction;

public class Ex18 {
	
	private double m;
	private double s;
	private int N;

	public void addDataValue(double x) {
		N++;
		s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
		m = m + (x - m) / N;
	}

	public double mean() {
		return m;
	}

	public double var() {
		return s / (N - 1);
	}

	public double stddev() {
		return Math.sqrt(this.var());
	}
	
	@Override
	public String toString() {
		return "m=" + m + ", s=" + s + ", N=" + N ;
	}

	public static void main(String[] args) {
		Ex18 accumulator = new Ex18();
		accumulator.addDataValue(3);
		accumulator.addDataValue(5);
		System.out.println(accumulator);
		System.out.println("var is : " + accumulator.var());
		System.out.println("stdev is : " +accumulator.stddev());
		accumulator.addDataValue(1);
		accumulator.addDataValue(7);
		System.out.println(accumulator);
		System.out.println("var is : " + accumulator.var());
		System.out.println("stdev is : " + accumulator.stddev());
	}
}
