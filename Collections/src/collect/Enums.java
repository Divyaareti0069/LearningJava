package collect;

public class Enums {
	public enum Week{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
	
	
		public static void main(String[] args) {
			for(Week w:Week.values()) {
				System.out.println(w);
				
		}
			
			System.out.println(Week.valueOf("TUESDAY"));
			System.out.println(Week.valueOf("WEDNESDAY").ordinal());
			
			

	}

}
