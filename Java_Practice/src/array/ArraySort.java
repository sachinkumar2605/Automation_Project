package array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int arr[]= {1,3,9,97,6,5,44,32,56,0};
		Arrays.sort(arr);
		System.out.println("sorting the integers");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
