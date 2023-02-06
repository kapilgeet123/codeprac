package PracticeQ2;

import java.util.Arrays;

public class third_larg {
	
	static int thirdLargest (int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		return arr[n-3];
	}

	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34, 16};
		int x = thirdLargest(arr);
		System.out.println("The third largest element of the array is: " + x);
	}

}
