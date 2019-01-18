package com.digimindset.java.lesson1;

/**
 * @author paullatzelsperger
 * @since 2019-01-18
 */
public class StringOperations {

  public String concatenate(String str1, String str2) {
    return concatWithStringFormat(str1, str2);
  }


  private String concatWithStringFormat(String s1, String s2) {
    return String.format("%s %s", s1, s2);
  }

  // Hello world, replace e with X -> HXllo world
  public String replace(String input, String search, String replacer){
    return null;
  }

  // Hello world -> 11
  public int length(String input){
    return -1;
  }

  // 6 -> "6"
  public String convertNumber(int number) {
    return null;
  }

  // "Hello World", "o" -> 2
  public int countOccurrence(String input, String search){
    return -1;
  }



}
