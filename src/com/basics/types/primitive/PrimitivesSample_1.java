package com.basics.types.primitive;

import static java.lang.Math.PI;

public class PrimitivesSample_1 {

	public static void main(String[] args) {

		System.out.println("Hallo World");

		int a = 6;
		System.out.println("a: " + a);

		char b = 'b';
		System.out.println("b: " + b);

		char c = 10;
		System.out.println("c: " + c); //Kein Compiler Error ,Bloss Keine Ausgabe von c
		System.out.println("c hat den Wert: " + (int) c); //casten
		int d = c;
		System.out.println("d: " + d);

		String x = "Hello ";
		String y = "com.example.AndroidATC World!";
		System.out.println("Text: " + x + y);

		float f1 = 4;
		System.out.println("f1: " + f1);
		float f2 = 5;
		System.out.println("f2: " + f2);
		float f3 = f1 + f2;
		System.out.println("Erstes float Zahl Ergebnis: " + f3);
		System.out.println("f1 + f2  liefert falsches Resultat: " + f1 + f2);  //falsches Resultat wegen Perioritaeten
		System.out.println("(f1 + f2) also mit Klammern liefert reichtiges Resultat: " + (f1 + f2));

		float ff1 = 4f;
		float ff2 = 5.15f;
		float ff3 = ff1 + ff2;
		System.out.println("Zweites float Zahl Ergebnis: " + ff3);

		float ff4 = 4;
		float ff5 = (float) 5.15; //casten
		float ff6 = ff4 + ff5;
		System.out.println("Drittes float Zahl Ergebnis: " + ff6);

		int m = (int) 10.02F; // Tzpumwandlung: float to int
		System.out.println("m: " + m);

		//Vergleich float , double in Genauigkeit
		float r = 4;
		float q = 2.01f;
		float p = 9.0123456789f;
		double n = 0.012345678911111111111111111111111;
		double g = 0.01234567891111111111111111111111122222222233333333;

		System.out.println("is equal: " + (n == g));

		System.out.println("r= " + r);
		System.out.println("q= " + q);
		System.out.println("p= " + p);
		System.out.println("n= " + n);
		System.out.println("g= " + g);
		String xx = "Ich bin";
		String space = " ";
		int alter1 = 50;
		int alter2 = 5;
		String yy = "Jahre alt";
		String result = "Text ist: " + xx + space + alter1 + alter2 + space + yy;
		System.out.println("Text ist: " + xx + space + alter1 + alter2 + space + yy);
		System.out.println(result);

		float flo = 5.5f;
		flo = (float) (flo + 100d);
		System.out.println("flo: " + flo);

		short as = 10;
		as = (short) (as + 230);
		System.out.println("as: " + as);

		//Zuweisungen , Arithmetisch
		int zahl_1, zahl_2;
		double zahl_3;

		///////////////////////
		zahl_1 = 1 / 3;
		System.out.println("zahl_1: " + zahl_1);//liefert 0
		zahl_3 = 1 / 3;
		System.out.println("zahl_3: " + zahl_3);//liefert 0.0
		zahl_3 = 1.0 / 3;
		System.out.println("zahl_3: " + zahl_3);//liefert 0.3333333333
		//////////////////
		zahl_1 = 2 + 4 * 6;
		System.out.println("zahl_1: " + zahl_1);//liefert 26
		zahl_1 = (2 + 4) * 6;
		System.out.println("zahl_1: " + zahl_1);//liefert 36
		/////////////////////
		// modulo operator
		zahl_2 = 15 % 3;
		System.out.println("zahl_2: " + zahl_2);//liefert 0
		zahl_2 = 17 % 3;
		System.out.println("zahl_2: " + zahl_2);//liefert 2
		//////////////////////////
		zahl_1 = 1;
		zahl_2 = zahl_1++;
		System.out.println("zahl_2: " + zahl_2);//liefert

		zahl_1 = 1;
		zahl_2 = ++zahl_1;
		System.out.println("zahl_2: " + zahl_2);//liefert

		System.out.println(PI);//Math.PI muss importiert werden





/*
	        //Typ -Umwandlung mit Hife von Java -Methoden
	        Integer number1 = 1 ;

	        float number2= number1.floatValue() ;
	        System.out.println("number2= " + number2);
	        System.out.println("number1= " + number1);



	        // casting notwendig
	        int aaa = 1;
	        float bbb = 2;
	        //aaa = bbb; // Hier verlangt Compiler des Studios nach Casting von bbbb
	        aaa = (int) bbb;
	        System.out.println("aaa= " + aaa);
	        System.out.println("bbb= " + bbb);


	        // Numerisch --> String
	        // erste Moeglichkeit
	        int i = 5;
	        String str1 = String.valueOf(i);
	        System.out.println("i= " + i);
	        System.out.println("str1= " + str1);



	        //Zweite Moeglichkeit
	        int ii = 5;
	        String str2 = Integer.toString(ii);
	        System.out.println("ii= " + ii);
	        System.out.println("str2= " + str2);

	        double dd = 5.306;
	        String str3 = Double.toString(dd);
	        System.out.println("dd= " +dd);
	        System.out.println("str3= " + str3);

	        //Umwandlung String to int
	        String numberStr = "10";
	        int res= Integer.parseInt(numberStr);
	        System.out.println(res);

	        //2. Methode>
	        numberStr = "11";
	        Integer resulted = Integer.valueOf(numberStr);
	        System.out.println(resulted);

	        System.out.println(resulted.intValue());

*/

	}

}
