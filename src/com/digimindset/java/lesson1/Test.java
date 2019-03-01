package com.digimindset.java.lesson1;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    String storedPin = "1234";
    Scanner scanner = new Scanner(System.in);

    /*
    System.out.print("Please enter 4-digit PIN: ");
    String pin = scanner.nextLine();

    while (!pin.equals(storedPin)) {
      System.err.print("Wrong pin, try again: ");
      pin = scanner.nextLine();
    }
    */

    String pin = null;
    do {
        if (pin != null) {
        System.err.print("Wrong pin, try again: ");
      } else {
        System.out.print("Please enter 4-digit PIN: ");
      }
      pin = scanner.nextLine();
    }
    while (!storedPin.equals(pin));


    System.out.println("PIN correct!");
  }


}