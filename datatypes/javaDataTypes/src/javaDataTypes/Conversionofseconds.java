package javaDataTypes;

import java.util.Scanner;

public class Conversionofseconds {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("enter seconds: ");
		        int seconds = sc.nextInt();

		        
		        int S = seconds % 60;  
		        int H = seconds / 60;  
		        int M = H % 60;         
		        H= H / 60;            

		        
		        System.out.print(H + ":" + M + ":" + S);

		        
		        System.out.print("\n");
		    }
		

	}


