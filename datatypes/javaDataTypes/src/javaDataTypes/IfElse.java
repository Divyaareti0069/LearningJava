package javaDataTypes;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter a number: ");
		        int N = sc.nextInt();
		        if((N%2!=0) ||(N>=6 && N<=20)){
		            System.out.println("Weird");
		        
		        }else{
		            System.out.println("Not Weird");
		        }

		        
		    }
		


	}


