import java.util.*;

public class Bit {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 0;
        // b = a--;
        // System.out.println(a);
        // System.out.println(b);

        // // int a = 10;
        // // int b = 0;
        // // b = ++a;
        // // System.out.println(a);
        // // System.out.println(b);

        // Get bit
        // int n = 0;
        // int pos = 2;
        // int bitmask = 1 << pos;
        // if ((bitmask & n) == 0) {
        // System.out.println("Zero bit value");
        // } else {
        // System.out.println("Non zero");
        // }

        // Set Bit
        // int n = 0;
        // int pos = 2;
        // int bitmask = 1 << pos;
        // int newnumber = bitmask | n;
        // System.out.println(newnumber);

        // Clear bit
        // int n = 5; //5 --> (0101)2
        // int pos = 2;
        // int bitmask = 1 << pos;
        // int notbitmask = ~(bitmask);
        // int newnumber = notbitmask & n;
        // System.out.println(newnumber);

        // Update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;

        if (oper == 1) {
            // Set
            System.out.println(bitmask | n);
        }

        else {
            // Clear
            int notbitmask = ~(bitmask);
            System.out.println(notbitmask & n);
        }
        sc.close();

    }
}
