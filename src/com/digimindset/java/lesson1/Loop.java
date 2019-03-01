package com.digimindset.java.lesson1;

/**
 * @author paullatzelsperger
 * @since 2019-02-15
 */
public class Loop {

  public static void main(String[] args) {

    int start = -10;
    int end = -100;

    int i;
    for (i = start; i > end; i --) {
      System.out.println("i's current value: " + i);
    }
    System.out.println("i's current value: " + i + ".");
  }
}
