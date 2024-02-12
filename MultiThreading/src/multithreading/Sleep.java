package multithreading;

public class Sleep extends Thread{

	/*
	 * public void run() { for(int i=1;i<=5;i++) { try { Thread.sleep(5000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } System.out.println(i); } }
	 */
	public static void main(String[] args) {
		
		try {
			for(int i=0;i<5;i++){
				
					Thread.sleep(200);
					System.out.println(i);
			}
				}catch(InterruptedException e) { 
					System.out.println(e);
				}
				
			
			}
		}
	
		
	
	

			
		
		
	


