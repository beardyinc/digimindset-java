package com.digimindset.java.lesson3;

/**
 * @author paullatzelsperger
 * @since 2019-03-08
 */
public class BoxingTest {

    public static void main(String[] args) {


        int a = 15;
        boolean b = false;
        Integer a2 = 27;

        Boolean eq = a == a2;

        Double d = 56.9;
        double d2 = 98.12;

        d = d2;


        String s = "12a34";
        
        //double d = Double.valueOf(s);

        Double dbl = null;
        double dbl2 = dbl;
    }
}
