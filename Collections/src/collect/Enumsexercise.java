package collect;

public class Enumsexercise {
	public enum Months{JAN,FEB,MAR,APR,AMAY,JUN,JULY,AUG,SEP,OCT,NOV,DEC}
	public static void main(String[] args) {
		for(Months m:Months.values()) {
			System.out.print(m);
		
		}
		
		System.out.println(m.valueof("AUG").ordinal);

	}

}
