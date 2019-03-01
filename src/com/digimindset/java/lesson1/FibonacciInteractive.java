package com.digimindset.java.lesson1;

/**
 * @author paullatzelsperger
 * @since 2019-02-15
 */
public class FibonacciInteractive {

  public static void main(String[] args) {

    String separator = " ";
    int f0 = 0;
    int f1 = 1;
    int n = 20;

    int previous = f0;
    int current = f1;

    System.out.print(f0 + separator);
    System.out.print(f1 + separator);

    for (int i = 2; i < n; i++) {
      int next = previous + current;
      System.out.print(next + separator);
      previous = current;
      current = next;
    } //end for
  }
}
