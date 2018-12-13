package Chapter2Sorting.ElementarySorts;

public class Transaction implements Comparable<Transaction> {
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
		if (anObject instanceof Transaction) {
			Transaction t = (Transaction) anObject;
			return ((who.equals(t.who) && when.equals(t.when) && amount == t.amount));
		} else
			return false;
	}

}
