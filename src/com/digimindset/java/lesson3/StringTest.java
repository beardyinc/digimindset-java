package com.digimindset.java.lesson3;

/**
 * @author paullatzelsperger
 * @since 2019-03-08
 */
public class StringTest {

    public static void main(String[] args) {

        String text = "the quick brown fox jumps over the lazy dog fox is a funny animal fox fox fox";
        //String text = "asldfjals;kdfj";
        String search = "fox";
        int index = -1;
        int counter = 0;

        // does text contain search at all?
        index = text.indexOf(search, index);
        if (index > -1) {
            System.out.println("found at index: " + index);
        } else {
            System.out.println("no more occurrences of " + search);
        }
        while (index > -1) {
            counter++;
            index = text.indexOf(search, index + 1);
            if (index > -1) {
                System.out.println("found at index: " + index);
            } else {
                System.out.println("no more occurrences of " + search);
            }
        }
        System.out.println(search + " occurs " + counter + " times in the text");
    }
}
