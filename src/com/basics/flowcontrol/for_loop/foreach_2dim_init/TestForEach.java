package com.basics.flowcontrol.for_loop.foreach_2dim_init;

public class TestForEach {

	public static void main(String[] args) {
		
		int[][] arr_1 = new int[3][5];

		//"Darstellung von Elementen "
		//"eines 2 Dimentionalen Arrays: nur indexen des Arrays 	"
		//"i=0,j=0  i=0,j=1,.....usw" );
		
		for (int i = 0 ; i< arr_1.length; i++) {
			
			System.out.print("\n");
			
			for (int j = 0; j < arr_1[i].length; j++) {
				
				System.out.print("i= " +i + " " );
				System.out.print("j= " +j+" " + '\t');
				
				  
			}
		}

	}

}

/* Ausgabe:
i= 0 
j= 0 j= 1 j= 2 
i= 1 
j= 0 j= 1 j= 2 
i= 2 
j= 0 j= 1 j= 2 
*/
