package com.digimindset.java.lesson1;

public class Test {

  public static void main(String[] args) {

    StringOperations str = new StringOperations();
    StringGenerator gen = new StringGenerator();
    String s1 = str.concatenate("Hello", "World");
    String s2 = str.concatenate("I am", gen.generate());
    System.out.println(s1);
    System.out.println(s2);

    Fibonacci f = new Fibonacci();
    System.out.println("*******************************");
    f.createFibonacciSeries(-10000000);
    System.out.println("*******************************");
    f.createFibonacciSeries(-10);
    System.out.println("*******************************");
    f.createFibonacciSeries(10);
    System.out.println("*******************************");
    f.createFibonacciSeries(100);
    System.out.println("*******************************");
    f.createFibonacciSeries(0);
    System.out.println("*******************************");
    f.createFibonacciSeries(10000000);
  }


}