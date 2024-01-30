package collect;

public class NestedTry {

	public static void main(String[] args) {
		
			try {
				int i=25/0;
				System.out.println(i);
				System.out.println("try 1 statement");
				
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("array exception ocuured");
					System.out.println("statement in catch2");
				}
				catch(Exception e) {
					System.out.println("exception ocuured");
					
				}
				finally{
						System.out.println("rest of the code......");	
					
			
				}
			}
		
		
		
					
					
			
		
	
	
	
			}
	
		
