package CU;

public class coutingsort {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 7, 7, 1, 4, 5,10 };
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int x[] = sort(arr,max);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

	}

	public static int[] sort(int arr[],int max) {
		int orr[] = new int[arr.length];
		int c[] = new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			c[arr[i]] = c[arr[i]] + 1;
		}
		for (int i = 1; i < c.length; i++) {
			c[i] = c[i] + c[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			orr[c[arr[i]] - 1] = arr[i];
			--c[arr[i]];
		}
		return orr;
	}

}
