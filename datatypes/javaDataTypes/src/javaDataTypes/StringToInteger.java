// Java program to convert a string to an integer
package javaDataTypes;

import java.util.*;

public class StringToInteger{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Input a string: ");

        
        String s1 = sc.nextLine();

        
        int result = Integer.parseInt(s1);

        
        System.out.println("The integer value is:"+ result);
        

        
    }
}
