package com.digimindset.java.lesson2;

/**
 * @author paullatzelsperger
 * @since 2019-02-08
 */
public class FlowControl {

  public static void main(String[] args) {
/*
    int count = 20;

    while (count < 11) {
      System.out.println("while loop " + count);
      count++;

    }
    count = 20;
    do {
      System.out.println("do loop " + count);
      count++;
    }
    while (count < 11);
*/
    int[] arr = {0, 2, 4, 6, 8, 10};
    for (int i = 0; i < arr.length; i++) {
      int value = arr[i];
      if (i == 3) {
        System.out.println("YAY, we have the fourth element and it is " + value);
      } else {
        System.out.println("array at index " + i + " has value " + value);
      }
    }
    System.out.println("***********************************");
    for (int i : arr) {
      System.out.println(i);
    }

  }
}
