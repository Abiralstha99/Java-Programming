public class Ceil {
    public static void main(String[] args) {
        // 1. Ceiling of a number = smallest number in an array greater or equal to
        // target
        // arr = [2,3,5,9,14,15]
        // target = 12
        // Output = 14
        int[] arr = { 0, 2, 3, 4, 15, 16 };
        int target = 5;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    public static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;

            if (target > arr[mid]) {
                start = mid + 1;
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            }

            else {
                return arr[mid];
            }

        }
        return arr[start];

    }
}