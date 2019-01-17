package com.basics.types.casting;

public class CastingPrimitives {
	
	public static void main(String[] args) {
		
		int intZahl;
		long longZahl;
		intZahl = 10;
		longZahl = 100;
		longZahl= intZahl; //kein Problem 
							//, implizite Typumwandlung
		intZahl = (int) longZahl; // Compiler Error
		// Der compiler schaut niemals auf die konkrete Werte der Variablen zur Laufzeit
		// Sondern einfach nach der Typen:
		
		// Der Compiler nimmt an dass ein Zahl von Typ long nicht zu int -Variablen passt.
		//====> eine Explizite Typ -Casting notwendig
		//d.h.) intZahl = (int) longZahl;
		
		System.out.println(intZahl);
		//probiere mit double und float
		
		
		
		//auch diese Beispiele
		//Typ /Umwandlung ohne Casting moeglich!
        char ch1 = '1';
        int k1 = ch1+1;
        System.out.println("kl= " + k1);

        int aa = 1;
        float bb = 2;
        bb = aa;
        System.out.println("aa= " + aa);
        System.out.println("bb= " + bb);


     // Typumwandlung: float to int		
		
        int m = (int)10.02F; 
        System.out.println("m: " + m);

		
		
	}
}
