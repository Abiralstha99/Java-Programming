import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int marks[] = new int[3];
        // marks[0] = 91;
        // marks[1] = 98;
        // marks[2] = 97;
        // int marks[] = { 91, 98, 97 };
        // for (int i = 0; i < 3; i++) {
        // System.err.println(marks[i]);
        // }

        // Take an array as input from the user. Search for a given number X and print
        // the index at which it occurs

        /*
         * System.out.print("Enter the size of Array ");
         * Scanner sc = new Scanner(System.in);
         * int size = sc.nextInt();
         * int numbers[] = new int[size];
         * 
         * // input
         * for (int i = 0; i < size; i++) {
         * System.out.print("Enter the " + (i + 1) + " number in Array ");
         * numbers[i] = sc.nextInt();
         * }
         * 
         * // Taking number from user
         * System.out.print("Enter the number you want to find ");
         * int x = sc.nextInt();
         * 
         * // output
         * for (int i = 0; i < numbers.length; i++) {
         * if (numbers[i] == x) {
         * System.err.print("Your number is in " + i + " index");
         * }
         * }
         * sc.close();
         */

        // 1. Take an array of names as input from the user and print them on the
        // screen.

        /*
         * System.out.println("Enter the number of names you want to insert");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * String names[] = new String[n];
         * 
         * // input
         * for (int i = 0; i < n; i++) {
         * System.out.println("Enter the " + (i + 1) + " element in Array");
         * names[i] = sc.next();
         * }
         * 
         * // output
         * System.out.println("The names are");
         * for (int i = 0; i <= n; i++) {
         * System.out.println(names[i]);
         * }
         * sc.close();
         */

        // 2. Find the maximum & minimum number in an array of integers.

        // creating array
        /*
         * System.out.println("Enter the number of terms");
         * Scanner sc = new Scanner(System.in);
         * int n = sc.nextInt();
         * int numbers[] = new int[n];
         * 
         * // taking input
         * for (int i = 0; i < n; i++) {
         * System.out.println("Enter the " + (i + 1) + " element");
         * numbers[i] = sc.nextInt();
         * }
         * 
         * // max and min
         * 
         * int max = numbers[0];
         * for (int i = 1; i < numbers.length; i++) {
         * if (max < numbers[i]) {
         * max = numbers[i];
         * }
         * }
         * System.out.println("The greatest number is " + max);
         * 
         * int min = numbers[0];
         * for (int i = 1; i < numbers.length; i++) {
         * if (min > numbers[i]) {
         * min = numbers[i];
         * }
         * }
         * System.out.println("The least number is " + min);
         * sc.close();
         * 
         */

        // 3. Take an array of numbers as input and check if it is an array sorted in
        // ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.

        // // creating an array
        // System.out.println("Enter the no of elements in array");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int numbers[] = new int[n];

        // // taking input
        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter the " + (i + 1) + "element");
        // numbers[i] = sc.nextInt();
        // }

        // arranging in ascending order
        // int temp = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // for (int j = (i + 1); j < n; j++) {
        // if (numbers[i] > numbers[j]) {
        // temp = numbers[i];
        // numbers[i] = numbers[j];
        // numbers[j] = temp;
        // }
        // }
        // }

        // // printing the arranged array
        // System.out.println("The array is");
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // sc.close();

        // Reversing an array

        // creating an array
        System.out.println("Enter the no of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

        // taking input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "element");
            numbers[i] = sc.nextInt();
        }

        int start = 0;
        int end = numbers.length - 1;
        swap(numbers, start, end);
        start++;
        end--;
        // printing
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        sc.close();

    }

    // Making a swap function
    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
