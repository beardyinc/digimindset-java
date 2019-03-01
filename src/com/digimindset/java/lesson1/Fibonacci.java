package com.digimindset.java.lesson1;

public class Fibonacci {

  public void printSeries(int count) {
    int n1 = 0, n2 = 1, n3, i;
    System.out.print(n1 + " " + n2);//printing 0 and 1

    for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
    {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }

  }

  public void createFibonacciSeries(int upperLimit) {
    if (upperLimit <= 2) {
      System.out.println("Fibonacci is only defined for n >= 2! But you wrote " + upperLimit);
      return;
    }

    int current;
    int previous;
    int next;


    current = 1;
    previous = 0;

    System.out.print(previous+" ");
    System.out.print(current+" ");

    for (int i = 0; i < upperLimit; i++) {
      next = current + previous;

      System.out.print(next+" ");
      previous = current;
      current = next;

    }
    System.out.println();

  }
}