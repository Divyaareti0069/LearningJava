package javaDataTypes;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Choose an Department:");
		        System.out.println("1. Applied Computer Science");
		        System.out.println("2. Data Science");
		        System.out.println("3. Cell and Moledular biology");
		        System.out.println("4. Health Information Systems");
		        

		        System.out.print("Enter your choice: ");
		        int choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("Applied Computer Science");
		                break;
		            case 2:
		                System.out.println("Data Science");
		                break;
		            case 3:
		                System.out.println("Cell and Moledular biology");
		                break;
		            case 4:
		                System.out.println("Health Information Systems");
		                break;
		            default:
		                System.out.println("you haven't chose any department");
		        }
		    }
		


	}


