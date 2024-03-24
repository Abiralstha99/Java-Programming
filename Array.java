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

        System.out.print("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " number in Array ");
            numbers[i] = sc.nextInt();
        }

        // Taking number from user
        System.out.print("Enter the number you want to find ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.err.print("Your number is in " + i + " index");
            }
        }
        sc.close();
    }
}
