
public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {55,43,26,13,11,6,5,2};
		int target = 2;
		System.out.println(binarySearch(arr,target));
	}
	static int binarySearch (int [] arr , int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start] < arr[end] ;
		int mid = start + (end-start)/2;
		while (start <= end) {
			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target > arr[mid]) {
					start = mid+1;
				}
				else if (target < arr[mid]){
					end = mid-1;
				}
			}
			else {
				if (target < arr[mid]) {
					start = mid+1;
				}
				else if (target > arr[mid]){
					end = mid-1;
				}
			}
		}
		return -1;
  }
}
