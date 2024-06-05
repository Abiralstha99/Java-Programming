// import java.util.*;

public class SB {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("My name is Khan");
        // System.out.println(sb);

        // // print character at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // // inserting a character
        // sb.insert(0, "sb");
        // System.out.println(sb);

        // // appending (Adding at last)
        // sb.append("and");
        // System.out.println(sb);

        // 1. reverse a string (using stringbuilder)

        System.out.println("Enter the string");
        StringBuilder word = new StringBuilder("Hello");
        StringBuilder result = new StringBuilder("");
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result.append(word.charAt(i));
        }
        System.out.println(result);

    }

}
