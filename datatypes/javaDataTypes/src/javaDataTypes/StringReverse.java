//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

//Given a string , print Yes if it is a palindrome, print No otherwise.

package javaDataTypes;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a string :");
        String A=sc.nextLine();
        String R=new StringBuilder(A).reverse().toString();
        
        if(A.equals(R)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

	}

}
