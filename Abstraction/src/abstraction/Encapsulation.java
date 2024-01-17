package abstraction;

public class Encapsulation {
	private long account_no;
	private String name,email;
	private float amount;
	
	public long getAccount_No() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no=account_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public float getAmount() {
		return amount;
		
	}
	
	public void setAmount(float amount) {
		this.amount=amount;
	}

	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setAmount(14000f);
		e.setEmail("divyaareti123@gmail.com");
		e.setName("divya");
		e.setAccount_no(1234567890);
		System.out.println(e.getAccount_No());
		System.out.println(e.getAmount());
		System.out.println(e.getEmail());
		System.out.println(e.getName());
	}

}
