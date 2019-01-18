package com.digimindset.java.lesson1;

import java.util.Random;

/**
 * @author paullatzelsperger
 * @since 2019-01-18
 */
public class StringGenerator {
   String generate(){
     byte[] b = new byte[100];
     new Random().nextBytes(b);
     return new String(b);
  }
}
