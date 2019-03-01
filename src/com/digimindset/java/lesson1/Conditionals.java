package com.digimindset.java.lesson1;

/**
 * @author paullatzelsperger
 * @since 2019-02-22
 */
public class Conditionals {

  public static void main(String[] args) {
    int dayOfWeek = 7;
    boolean hasAccessRights = true;
    boolean isWeekDay = dayOfWeek < 6;
    boolean hasMasterKey = false;


    String status = "valid";
    switch (status) {
      case "valid":
      case "VALID":
        System.out.println("access is granted");
        break;
      case "NOT_WEEKDAY":
        System.out.println("Access denied, only on weekdays!");
        break;
      case "NOT_AUTHORIZED":
        System.out.println("Access denied, you do not have permission");
        break;
      default:
        System.out.println("Status not recognized");
        break;
    }
  }

}
