import java.util.Scanner;

class SecondClass {
        public static void main(String args[]) {
            // System.out.println ("*");
            // System.out.println ("**");
            // System.out.println ("***");
            // System.out.println("****");
            // Scanner sc = new Scanner(System.in);
            // String name = sc.next();
            // System.out.println(name);

            //Take 2 variables and print their sum

            Scanner sc = new Scanner (System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("The sum is " + sum);
            sc.close();
            
        }
}