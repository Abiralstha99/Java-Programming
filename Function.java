import java.util.*;

public class Function {
    /*
     * First function - To print name
     * public static void printName(String name) {
     * System.out.println(name);
     * return;
     * }
     * 
     * 
     * public static int multiply(int a, int b) {
     * int mult = a * b;
     * return mult;
     * }
     */

    // public static int multiply(int a, int b) {
    // int mult = a * b;
    // return mult;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = multiply(a, b);
    // System.out.println(sum);
    // sc.close();
    // }

    // Function for a factorial

    /*
     * public static void fact(int a) {
     * int n = 1;
     * for (int i = 1; i <= a; i++) {
     * n = n * i;
     * }
     * System.out.println("The factorial is " + n);
     * }
     * 
     * public static void main(String[] args) {
     * System.out.print("Enter the number");
     * Scanner sc = new Scanner(System.in);
     * int num = sc.nextInt();
     * fact(num);
     * }
     */

    // Program to calculate prime or composite

    public static void calculate(int n) {
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                j++;
            }
        }
        if (j == 1) {
            System.out.print("Prime");
        } else {
            System.err.print("Composite");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculate(n);
        sc.close();
    }

}
