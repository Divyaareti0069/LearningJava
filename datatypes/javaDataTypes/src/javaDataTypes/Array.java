package javaDataTypes;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		        int[] array = {34,57,21,44,69,75,86,24,16};

		        System.out.println("Original Array: " + Arrays.toString(array));

		        int ctr = 0;

		        for (int i = 0; i < array.length; i++) {
		            if (array[i] % 2 == 0)
		                ctr++;
		        }

		        System.out.println("Number of even numbers : " + ctr);
		        System.out.println("Number of odd numbers  : " + (array.length - ctr));
		    }
		


	}


