
//Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
package javaDataTypes;

import java.util.Scanner;

public class Twonumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int n1 = sc.nextInt();
        System.out.print("enter second number");
        int n2 = sc.nextInt();

        System.out.println("Sum of two numbers: " +  (n1 + n2));
        System.out.println("Difference of two numbers: " +  (n1 - n2));
        System.out.println("Product of two numbers: " + n1 * n2);
        System.out.println("Average of two numbers: " + (n1+n2) / 2);
        System.out.println("Max among the two numbers: " + Math.max(n1, n2));
        System.out.println("Min among the two numbers: " + Math.min(n1, n2));

	}

}
