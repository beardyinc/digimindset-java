package com.digimindset.java.lesson1;

/**
 * @author paullatzelsperger
 * @since 2019-02-01
 */
public class FibonacciTest {

  public static void main(String[] args) {
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
