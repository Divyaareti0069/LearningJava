package inherit;

public class Methodoverriding {
 int fee() {
	 int fee=10000;
	 return fee;
	 
 }
	public static void main(String[] args) {
		Methodoverriding m=new Methodoverriding();
		Bradley b=new Bradley();
		UCM u=new UCM();
		GVSU g=new GVSU();
		System.out.println(g.fee());
		System.out.println(u.fee());
		System.out.println(b.fee());
		System.out.println(m.fee());

	}

}
