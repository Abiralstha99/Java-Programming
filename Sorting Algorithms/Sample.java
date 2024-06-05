import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void Cyclic (int[]arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }


    static void Insertion (int []arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j= i+1 ; j>0 ;j--){
                if (arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
            
        }
    }

    static void Selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr, 0, last);
            swap(arr, MaxIndex,last);
        }
    }

    public static int getMaxIndex(int []arr , int start , int end){
        int max = start;
        for (int i = start;i<=end;i++){
            if (arr[i]>arr[max]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int arr[]) {
        Boolean swapped;
        for (int i = 0; i < arr.length; i++) { // Outer loop should run till n-1
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
