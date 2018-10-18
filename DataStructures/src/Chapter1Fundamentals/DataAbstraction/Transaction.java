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
	
	public boolean equals(Object anObject) {
		if(anObject instanceof Transaction) {
			Transaction t = (Transaction) anObject;
			return ((who.equals(t.who) && when.equals(t.when) &&
					amount == t.amount));
		}else
		return false;
	}
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction("John", new Date(12,2,2000), 1200);
		Transaction transaction2 = new Transaction("John", new Date(12,2,2000), 1200);
		Transaction transaction3 = new Transaction("Mark", new Date(7,7,2020), 770);
		System.out.println("Transactions are :");
		System.out.println(transaction + " and " + transaction2 +" and "+ transaction3);
		System.out.println("Equals method check, expected true: ");
		System.out.println(transaction.equals(transaction2));
		System.out.println("Equals method check, expected false : ");
		System.out.println(transaction.equals(transaction3));
	}
}
