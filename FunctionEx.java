import java.util.*;

public class FunctionEx {
    // WAP to average 3 number

    /*
     * public static void avg(int a, int b, int c) {
     * float sum = (a + b + c) / 3;
     * System.err.println("The average is " + sum);
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int c = sc.nextInt();
     * avg(a, b, c);
     * }
     */

    // Write a function to print the sum of all odd numbers from 1 to n.

    /*
     * public static int sum(int n) {
     * int add = 0;
     * for (int i = 1; i <= n; i++) {
     * if (i % 2 != 0) {
     * add = add + i;
     * }
     * }
     * return add;
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * int addition = sum(n);
     * System.err.println("The sum is " + addition);
     * }
     */

    // Write a function which takes in 2 numbers and returns the greater of those
    // two.

    /*
     * public static void comp(int a, int b) {
     * if (a > b) {
     * System.out.println(a + " is greater");
     * } else {
     * System.out.println(b + " is greater");
     * }
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter first number");
     * int a = sc.nextInt();
     * System.out.println("Enter second number");
     * int b = sc.nextInt();
     * comp(a, b);
     * sc.close();
     * }
     */

    // Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    /*
     * public static void cir(int rad) {
     * final double pi = 3.14;
     * double circumference = 2 * pi * rad;
     * System.out.println("The circumference is " + circumference);
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("Enter the radius");
     * Scanner sc = new Scanner(System.in);
     * int rad = sc.nextInt();
     * cir(rad);
     * sc.close();
     * }
     */

    // Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.

    /*
     * public static String eligible(int age) {
     * if (age > 18) {
     * String a = "eligible";
     * return a;
     * } else {
     * String b = "not eligible";
     * return b;
     * }
     * 
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int age = sc.nextInt();
     * System.out.println("You are " + eligible(age));
     * sc.close();
     * }
     */

    // 6. Write an infinite loop using do while condition.

    /*
     * public static void infinity(int a) {
     * for (int i = 1; i <= a; i--) {
     * System.out.println(i);
     * }
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * infinity(a);
     * }
     */

    // 7. Write a program to enter the numbers till the user wants and at the end it
    // should display the count of positive, negative and zeros entered.

    /*
     * public static void count(int num) {
     * int p = 0;
     * int n = 0;
     * int z = 0;
     * for (int i = 0; i <= num; i++) {
     * if (i > 0) {
     * p = p + 1;
     * } else if (i < 0) {
     * n = n + 1;
     * } else {
     * z = z + 1;
     * }
     * }
     * System.out.println("Positive is " + p);
     * System.out.println("Negative is " + n);
     * System.out.println("Zero is " + z);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int num = sc.nextInt();
     * count(num);
     * sc.close();
     * }
     */

    // 8. Two numbers are entered by the user, x and n. Write a function to find the
    // value of one number raised to the power of another i.e. x^n.

    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int x = sc.nextInt();
     * int n = sc.nextInt();
     * System.out.println(Math.pow(x, n));
     * sc.close();
     * }
     */

    // 9.Write a function that calculates the Greatest Common Divisor of 2 numbers.
    // (BONUS)

    /*
     * public static void HCF(int a, int b) {
     * int min = Math.min(a, b);
     * while (min > 0) {
     * if (a % min == 0 && b % min == 0) {
     * System.out.println("The HCF is " + min);
     * } else
     * min = min - 1;
     * }
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("Enter first number");
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * System.out.println("Enter first number");
     * int b = sc.nextInt();
     * HCF(a, b);
     * sc.close();
     * 
     * }
     */

    // 10. Write a program to print Fibonacci series of n terms where n is input by
    // user :
    // 0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the
    // previous 2 numbers that came before it. (BONUS)

    public static void fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter nth term");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }

}
