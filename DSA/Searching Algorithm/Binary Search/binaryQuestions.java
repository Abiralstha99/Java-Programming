
public class binaryQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ceiling of a number : smallest element in array greater or = target 
		 int [] arr = {2,3,5,9,14,16,18 };
		int target = 17;
		System.out.println(binarySearch(arr, target));
		
		
	}
	static int binarySearch (int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			//find the middle element
			int mid = start + (end-start)/2;
			if (arr[mid]==target) {
				return arr[mid];
			}
			else if (target > arr[mid]){
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return arr[start];	
	}

}
