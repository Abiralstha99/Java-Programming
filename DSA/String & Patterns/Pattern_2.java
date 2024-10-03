public class Pattern_2 {
    public static void main(String[] args) {
        /*
         * *
         ** **
         *** ***
         ********
         ********
         *** ***
         ** **
         * *
         * 
         * 
         * // Upper half
         * for (int i = 1; i <= 4; i++) {
         * // 1st part
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * 
         * 
         * // spaces
         * int spaces = 2 * (4 - i);
         * for (int j = 1; j <= spaces; j++) {
         * System.out.print(" ");
         * }
         * 
         * // 2nd part
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * // Lower part
         * for (int i = 4; i >= 1; i--) {
         * // 1st part
         * for (int j = i; j >= 1; j--) {
         * System.out.print("*");
         * }
         * // spaces
         * int spaces = 2 * (4 - i);
         * for (int j = spaces; j >= 1; j--) {
         * System.out.print(" ");
         * }
         * // 2nd part
         * for (int j = i; j >= 1; j--) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         ***** 
         *****
         *****
         *****
         *****
         * 
         * 
         * for (int i = 1; i <= 5; i++) {
         * // spaces
         * int spaces = 5 - i;
         * for (int j = 1; j <= spaces; j++) {
         * System.out.print(" ");
         * }
         * 
         * // stars
         * for (int k = 1; k <= 5; k++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         * 
         * 
         * 
         * for (int i = 1; i <= 5; i++) {
         * // spaces
         * int spaces = 5 - i;
         * for (int j = 1; j <= spaces; j++) {
         * System.out.print(" ");
         * }
         * // number
         * for (int k = 1; k <= i; k++) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * }
         */

        /*
         * 1
         * 2 1 2
         * 3 2 1 2 3
         * 4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         * 
         * 
         * 
         * for ( int i=1; i<=5; i++){
         * //spaces
         * int spaces = 5-i;
         * for (int j=1; j<=spaces; j++){
         * System.out.print(" ");
         * }
         * 
         * //1st half
         * for ( int k=i; k>=1; k--){
         * System.out.print(k);
         * }
         * 
         * //2nd half
         * for ( int l=2; l<=i; l++){
         * System.out.print(l);
         * }
         * System.out.println();
         * }
         */

        /*
           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
         */

        for (int i = 1; i <= 4; i++) {
            // Upper half - Spaces
            int spaces = 4 - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // upper 1st half - Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // upper 2nd half - Stars
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            // Lower half - Spaces
            int spaces = 4 - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // upper 1st half - Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // upper 2nd half - Stars
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
