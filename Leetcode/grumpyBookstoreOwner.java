import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class grumpyBookstoreOwner {

	public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
		int sum = 0;
		int requiredMaxSum=0;
		for (int i = 0; i < customers.length; i++) {
			if (grumpy[i] == 0) {
				sum += customers[i];
			}
			int start = i;
			int end = i + X-1;
			int MaxSum = 0;
			
			while (start <= end && start < customers.length && end < customers.length) {				
				if (grumpy[start] == 1) {
					MaxSum += customers[start];
				}
				start++;
				requiredMaxSum = Math.max(requiredMaxSum, MaxSum);
			}			
		}
		return sum+requiredMaxSum;
	}
	/*---------------------------Brute force-------------------
	int max = 0;
	
	for (int i = 0; i < customers.length; i++) {
		if (grumpy[i] == 0) {
			max += customers[i];
		}
		
	}
	//System.out.println("Max: " + max);
	
	int prevSum = 0;
	for (int i = 0; i < customers.length; i++) {
		int loop = X;
		int j = i;
		int sum = 0;
	
		while (loop != 0) {
			if (j < customers.length) {
				sum += customers[j];
				if (grumpy[j] == 0) {
					sum -= customers[j];
				}
			}
				j++;
				loop--;
			}
			if (sum > prevSum) {
				prevSum = sum;
			}
		}
	
	//System.out.println("Sum : " + prevSum);
	
	return max + prevSum;*/

	public static void main(String[] args) {
		int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
		int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
		int x = 3;
		 //int[] customers = { 0 };
		 //int[] grumpy = { 1 };
		 //int x = 1;
		int maxSum = maxSatisfied(customers, grumpy, x);
		System.out.println(maxSum);
	}

}
