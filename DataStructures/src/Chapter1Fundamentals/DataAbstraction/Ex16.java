package Chapter1Fundamentals.DataAbstraction;

public class Ex16 {
	
	private long numerator;
	private long denominator;
	
	public Ex16(long numerator, long denominator) {
		if(denominator == 0) throw new RuntimeException("Denominator can not be 0 !");
		this.numerator = numerator;
		this.denominator = denominator;
		if(!(gcd(numerator,denominator) == 1)) {
			throw new RuntimeException("numerator and denominator have common factors!  ");
		}
	}
	public long gcd(long p, long q) {
		if(q == 0) return p;
		long r;
		r = p % q;
		return gcd(q,r);
	}
	
	public Ex16 plus(Ex16 b) {
		long a1 = this.numerator;
		long a2 = this.denominator;
		long b1 = b.numerator;
		long b2 = b.denominator;
		long newNumerator = a1* b2 +  b1*a2;
		long newDenominator = a2*b2;
		return new Ex16(newNumerator,newDenominator);
	}
	
	public Ex16 minus(Ex16 b) {
		long a1 = this.numerator;
		long a2 = this.denominator;
		long b1 = b.numerator;
		long b2 = b.denominator;
		long newNumerator = Math.abs(a1* b2 - b1*a2);
		long newDenominator = a2*b2;
		return new Ex16(newNumerator,newDenominator);
	}
	
	@Override
	public String toString() {
		return  numerator + "/" + denominator ;
	}
	
	public static void main(String[] args) {
		Ex16 rational = new Ex16(4,7);
		System.out.println(rational.plus(new Ex16(5,2)));
		System.out.println(rational.minus(new Ex16(5,2)));
	}
}
