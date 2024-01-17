package concepts;

public class Anonymousobject {

	
		void fact(int n) {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact*=i;
				
			}
			System.out.println(fact);
		}
		
		public static void main(String[] args) {
			new Anonymousobject().fact(6);

	}
		}

