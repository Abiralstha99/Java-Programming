import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        // Syntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements
        list.add(0);
        list.add(6);

        // Using for loop for adding elements
        for (int i = 0; i <= 10; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        sc.close();

        // // to get an element
        // int element = list.get(0);
        // System.out.println(element);

        // // add elements in between
        // list.add(1, 5);
        // System.out.println(list);

        // // set element
        // list.set(1, 7);
        // System.out.println(list);

        // // remove elements
        // list.remove(2); // index as input
        // System.out.println(list);

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
