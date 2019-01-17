package com.basics.flowcontrol.for_loop.foreach_2dim_1;

public class ForLoopMultidimArray {

	public static void main(String[] args) {

		int[][] a = {

				{ 1, 2, 3 }, { 4, 5, 6, 7 }, { 7 } };

		System.out.println("Length for Row 1 is: " + a[0].length);
		System.out.println("Length for Row 2 is: " + a[1].length);
		System.out.println("Length for Row 3 is: " + a[2].length);
		/////////////////////////////////////////////////
		int[][] b = {

				{ 10, -12, -13 }, { 14, 15, 16, -17 }, { 17 } };

		for (int i = 0; i < b.length; ++i) {
			for (int j = 0; j < b[i].length; ++j) {
				System.out.print(b[i][j] + "\t");

			}

		}
		
		System.out.println();
		/////////////////////////////////////////////////
		int[][] c = {

					{ 10, -12, -13 }, { 14, 15, 16, -17 }, { 17 } 
				};

		
		for (int[] innerArray : c) {
			for (int element : innerArray) {
				System.out.print(element + "\t");
			}
		}
		System.out.println();
		//////////////////////////////////////////
		//3 Dim. Array
		int[][][] test = {
				{
					{1,2,-3},
					{2,3,4}
				},
				{
					{-4,-5,6,9},
					{1},
					{2,3}
					
				}
		};
		
		for (int[][] array2D : test) {
			for (int[] array1D : array2D) {
				for (int item : array1D) {
					System.out.print(item + " ' ");
				}
				
			}
			
		}
		
		
	}

}
