import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MinimumAbsDiffInArray {

	// public static void main(String[] args) {
	// // Complete the minimumAbsoluteDifference function below.
	// int [] arr= {0,8,-9,-1};
	// int minimum = Math.abs(arr[0] - arr[1]);
	// for (int i = 0; i < arr.length-1; i++) {
	// for (int j = i + 1; j < arr.length; j++) {
	// int compute = Math.abs(arr[i] - arr[j]);
	// if (compute < minimum) {
	// minimum = compute;
	// }
	// }
	// }
	// System.out.println(minimum);
	// }

	public static void main(String[] args) {

		int[] arr = { 4, 8, -2, -1 };
		Arrays.sort(arr);
		for(int i = 0; i < (arr.length); i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		int minimum = 999999999;
		for (int i = 0; i < (arr.length - 1); i++) {
			int temp = Math.abs(arr[i] - arr[i+1]);
			if (temp < minimum)
				minimum = temp;
		}
		// your code goes here
		System.out.println(minimum);
	}

}
