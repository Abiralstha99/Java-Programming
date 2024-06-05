import java.util.*;

public class Array2D {
    public static void main(String[] args) {

        /*
         * //1. Basic input output in a 2D Array
         * // defining an 2D array
         * System.out.println("Enter the number of rows ");
         * Scanner sc = new Scanner(System.in);
         * int rows = sc.nextInt();
         * System.out.println("Enter the number of columns ");
         * int columns = sc.nextInt();
         * int numbers[][] = new int[rows][columns];
         * 
         * // input
         * for (int i = 0; i < rows; i++) {
         * for (int j = 0; j < columns; j++) {
         * System.out.println("Enter the " + i + "," + j + " element");
         * numbers[i][j] = sc.nextInt();
         * }
         * }
         * 
         * // output
         * for (int i = 0; i < rows; i++) {
         * for (int j = 0; j < columns; j++) {
         * System.out.print(numbers[i][j]);
         * }
         * System.err.println();
         * }
         * 
         * sc.close();
         */

        // 2. Transpose of N*M size matrix

        // defining an array
        System.out.println("Enter the no of rows ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the no of column ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];

        // Taking inputs
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter " + i + "," + j + " element");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transpose and output
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
        sc.close();

        /*
         * WHile taking input
         * i < 2
         * j < 3
         * i = 0 ; j = 0,1,2 [(0,0),(0,1),(0,2)] = [1,3,5]
         * i = 1; j =0,1,2 [ (1,0),(1,1),(1,2)] = [2,4,6]
         * 
         * 
         * //Transpose
         * 1 2
         * 3 4
         * 5 6
         * 
         * i<3
         * j<2
         * [j][i]
         * i=0 ; j = 0,1 [(0,0),(1,0)] = [1, 2]
         * i = 1 ; j = 0,1 [(0,1),(1,1)] = [3,4]
         * i = 2 ; j=0,1 [(0,2),(1,2)] = [5,6]
         */
    }
}
