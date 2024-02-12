package multithreading;

public class Amount{
	int amount;
	String Currency;
	
	public Amount(String Currency,int amount) {
		this.Currency=Currency;
		this.amount=amount;
		
	}
	 public class CurrencyDoNotMatchException extends RuntimeException{
		 public CurrencyDoNotMatchException(String msg) {
			 super(msg);
		 }
		 
	 }
	
	public void add(Amount other)  {
		if(!this.Currency.equals(other.Currency)) {
			throw new CurrencyDoNotMatchException("curriences doesn't match"+this.Currency+" & "+other.Currency);
		}
		
	}
	

	@Override
	public String toString() {
		return "Amount [amount=" + amount + ", Currency=" + Currency + "]";
	}





	public static void main(String[] args) {
	Amount a1=new Amount("EUR",90);
	Amount a2=new Amount("USD",90);
	a1.add(a2);
	
	System.out.println(a1);

	}

}
