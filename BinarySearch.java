package CU;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int res = BinarySearch(arr, 0, arr.length - 1, 90);
		if (res == -1) {
			System.out.println("Element is not present in the array");
		} else {
			System.out.println("Element is present at " + res + "th index of array.");
		}

	}

	public static int BinarySearch(int arr[], int lo, int hi, int item) {
		if (hi >= lo) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			}
			if (arr[mid] > item) {
				return BinarySearch(arr, lo, mid - 1, item);
			} else {
				return BinarySearch(arr, mid + 1, hi, item);
			}
		}
		return -1;
	}

}
