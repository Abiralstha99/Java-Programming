import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // concatenation
        // String firstName = "Abiral";
        // String lastName = "Shrestha";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length()); //Finding length of string

        // charAt (Accessing character of a string)
        // for (int i = 0; i < firstName.length(); i++) {
        // System.out.println(firstName.charAt(i));
        // }

        // Comparing two strings
        // String name1 = "Abiral";
        // String name2 = "Abiral1";
        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not equal");
        // }

        // Substrings in java
        // String sentence = "My name is Khan";
        // substring (Beginning of index, ending of index)
        // String name = sentence.substring(11, 15);
        // System.out.println(name );

        // 1. Take an array of Strings input from the user & find the cumulative
        // (combined) length of all those strings.

        // Taking array
        // System.out.println("Enter the size of array");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // sc.nextLine();
        // String words[] = new String[size];

        // // Input
        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter the name for " + (i + 1) + " element");
        // words[i] = sc.nextLine();
        // }

        // // Finding and printing length
        // int totallength = 0;
        // for (int i = 0; i < size; i++) {
        // totallength = totallength + words[i].length();
        // }
        // System.out.println("the total length is " + totallength);

        // sc.close();

        // 2. Input a string from the user. Create a new string called ‘result’ in which
        // you will replace the letter ‘e’ in the original string with letter ‘i’.
        // Example :
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”

        // System.out.println("Enter the string");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // String result = "";
        // // String result = name.replace("e", "i");

        // // not using method
        // for (int i = 0; i < name.length(); i++) {
        // if (name.charAt(i) == 'e') {
        // result += 'i';
        // } else {
        // result += name.charAt(i);
        // }

        // }
        // System.out.println("The new string is " + result);

        // sc.close();

        // 3. Input an email from the user. You have to create a username from the email
        // by deleting the part that comes after ‘@’. Display that username to the user.
        // Example :
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        /*
         * System.out.println("Enter your email");
         * Scanner sc = new Scanner(System.in);
         * String email = sc.nextLine();
         * String username = "";
         * for (int i = 0; i < email.length(); i++) {
         * if (email.charAt(i) == '@') {
         * username += email.substring(0, i);
         * }
         * }
         * System.out.println(username);
         * sc.close();
         */

        // 4. WAP to reverse a string
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }
        if (result.compareTo(word) == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
