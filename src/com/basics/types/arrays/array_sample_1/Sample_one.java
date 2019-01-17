package com.basics.types.arrays.array_sample_1;

import java.util.Scanner;

public class Sample_one {

	public static void main(String[] args) {
		
		double[] myList;
		myList = new double[4];
		myList[0] = 1.1;
		myList[0] = 2.5;
		myList[0] = 3.7;
		myList[0] = 4.9;

		
		 int[] zahlen = new int[] {1,123,3};
		 
		 int[] zahlen_neu = {11,1231,31};
		 
		// int[] zahlen_old = new int[4] {1,123,3};//Hier darf man Groesse nicht eingeben.
	
		//Uebung 1:
        //Array -Deklaration
        // Deklaration besteht aus Zwei Komponenten> Type,name
        //Brackets (Halteklammer) besagt dass es sich um Array Varaiable handelt:
        //d.h. : Ein Variable, die ein Array beeinhaltet.
        // Die Gr��e des Arrays ist nicht Teil seines Types !!! -> Deshalb Bracket ist leer!
        // Allein mit Deklaration wird kein Array Erzeugt.
        // Diese Deklaration verstaendigt den Compiler , dass dieser Variable (hier: x)
        //  einen Array mit einem bestimmten Type( hier : int) beinhaltet.
        //
        int[] x;
        //Allocate ,Zuteilung von Memory fuer 10 Integer.
        x = new int[10];
        //Initialisierung
        //1.Element
        x[0] = 100;
        // restliche Elemnten:
        x[1] = 200;
        x[2] = 300;
        x[3] = 400;
        x[4] = 500;
        x[5] = 600;
        x[6] = 700;
        x[7] = 800;
        x[8] = 900;
        x[9] = 1000;
//        System.out.println("Element at index 1 is   " +x[0]);
//        System.out.println("Element at index 2 is   " +x[1]);
//        System.out.println("Element at index 3 is   " +x[2]);
//        System.out.println("Element at index 4 is   " +x[3]);
//        System.out.println("Element at index 5 is   " +x[4]);
//        System.out.println("Element at index 6 is   " +x[5]);
//        System.out.println("Element at index 7 is   " +x[6]);
//        System.out.println("Element at index 8 is   " +x[7]);
//        System.out.println("Element at index 9 is   " +x[8]);
//        System.out.println("Element at index 10 is   " +x[9]);
        
        
        /*
        //Uebung 2:
        // folgende Staement liefert Exception :    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        System.out.println("Element at index 10 is   " +x[10]);
        */
        

/*
        //Uebung 3:
        // folgende Staement liefert Exception :    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
       // x[10] = 1100;
*/
       
        /*
      //Uebung 4:
        //Deklaration , Creation, initialization
        // => Die Groesse wird automatisch ermittelt.
        int[] a = {10,11,12,13};
        System.out.println("Element 'a' at index 2 is   " +a[2]);
        */
     /*   
     // Uebung 5:
        // looping
        int[] b = {1,2,3,4};
        // k is ein Laufvariabl
        for (int k= 0 ; k < b.length  ; k++){
        	System.out.print(b[k]);
        	if (k != b.length -1)
        		System.out.print(",");
        }
        */
        
     
        /*  //Uebung 6:
          //wie 5 , aber mit foreach -Schleife
          // es gibt keine nach Aussen sichtbare Laufvariable.
          //gibt in jeder Iteration den Wert zurueck!
          //iteriert ueber alle Elemente und ruft den Block {} auf!
          //d.h. foreach Element do this and that
           */
   /*     
        int[] ziffern = {1,2,3,4};
        int zaehler= 0;
        for (int z:ziffern) {
        	zaehler++;
        	if (zaehler < ziffern.length)
        		System.out.print(z + ", ");
        	else
        		System.out.print(z);
        	
        	
        }
        
        System.out.println("");
     */
        
        /*
     //Uebung 7 dasselbe fuer zeichenkette
        char[] b = {'a','b','c','d'};
        int counter = 0;
        for (char m:b ){
            counter++;
            if (counter < b.length)
                System.out.print(m + " , ");
            else
                System.out.print(m);
        }
        */
/*
        //Uebung 8
        String[] stringArray = {"Alex","Bob","Celvine","Debora"};
        int counter = 0;
        for (String element:stringArray ){
            counter++;
            if (counter < stringArray.length)
                System.out.print(element + " , ");
            else
                System.out.print(element);
        }
        */
        
        /////////////////////////////////
      //Enter data to java program through Keyboard
        //via Scanner -Klasse
        //1) create an instance of Scanner
        Scanner scanner = new Scanner(System.in);
        float score;

        System.out.println("Enter the score:" );
        score = scanner.nextInt();

        if (score >= 70){

            System.out.println("Pass: You are Android Certified App Developer!! " );
        }
        else{
            System.out.println("Fail: You may repeat the exam after 24 Hours" );
        }

      

	}

}
