import java.util.*;
public class FourthClass {
    public static void main(String[] args) {
        // for loop
        // for (int i = 0 ; i<11 ; i++) {
        //     System.out.println(i);
        // }

        // while loop 
        // int i = 0;
        // while ( i<11){
        //     System.out.println(i);
        //     i++;
        // }


        //Print sum of first n natural numbers
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = i + sum;
           i++;
        }
        System.out.println(sum);
        sc.close(); 
    }
}
