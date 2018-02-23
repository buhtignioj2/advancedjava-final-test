package prob03;

public class Money {
	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public Object add(Money cnt) {
		return new Money(this.amount + cnt.amount);
	}

	public Object minus(Money cnt) {
		return new Money(this.amount - cnt.amount);
	}

	public Object multiply(Money cnt) {
		return new Money(this.amount * cnt.amount);
	}

	public Object devide(Money cnt) {
		return new Money(this.amount / cnt.amount);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	
    
}
