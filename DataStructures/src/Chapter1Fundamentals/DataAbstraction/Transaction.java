package Chapter1Fundamentals.DataAbstraction;

public class Transaction implements Comparable<Transaction>{
	String who;
	Date when;
	double amount;
	
	public Transaction(String who, Date when, double amount) {
		super();
		this.who = who;
		this.when = when;
		this.amount = amount;
	}

	public String who() {
		return who;
	}
	
	public Date when() {
		return when;
	}
	
	public double amount() {
		return amount; 
	}
	
	public String toString() {
		return who + " " + when + " " + amount;
	}
	
	@Override
	public int compareTo(Transaction o) {
		if (this.amount > o.amount)
			return 1;
		else if (this.amount < o.amount)
			return -1;
		return 0;
	}
	
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction("John", new Date(12,2,2000), 1200);
		System.out.println(transaction);
	}
}
