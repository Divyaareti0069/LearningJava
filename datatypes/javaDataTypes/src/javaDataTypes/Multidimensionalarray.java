package javaDataTypes;

public class Multidimensionalarray {

	public static void main(String[] args) {
		
		        int[][][] a = {
		            {
		                {1, 2, 3},
		                {4, 5, 6},
		                {7, 8, 9}
		            },
		            {
		                {10, 11, 12},
		                {13, 14, 15},
		                {16, 17, 18}
		            }
		        };

		        
		        System.out.println("Elements of the 3 dimensional array:");

		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a[i].length; j++) {
		                for (int k = 0; k < a[i][j].length; k++) {
		                    System.out.print(a[i][j][k] + " ");
		                }
		                System.out.println();
		            }
		            System.out.println();
		        }
		    }
}
	
	
		





