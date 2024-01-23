package string;

public final class ImmutableClass {
	
	final int socialSecurityNumber=987654210;

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public static void main(String[] args) {
		ImmutableClass i=new ImmutableClass();
		System.out.println(i.getSocialSecurityNumber());

	}

}
