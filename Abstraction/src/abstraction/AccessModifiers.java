package abstraction;

public class AccessModifiers {
	private int id;
	private String name;
	private String companyname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getCompanyName() {
		return companyname;
	}
	
	public void setCompanyName(String companyname) {
		this.companyname=companyname;
	}
	
	protected void displayinfo() {
		System.out.println(id+" "+name);
	}
	
	void printCompanyName() {
		
		System.out.println(companyname);
		
	}
	public static void main(String[] args) {
		
		AccessModifiers a= new AccessModifiers();
		a.setCompanyName("capgemini");
		a.setId(1);
		a.setName("divya");
		a.displayinfo();
		a.printCompanyName();
	}


}
