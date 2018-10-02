import java.util.*;
import java.io.*;

class Solution {

	public static int findMax(int x[], int n) {
		int max = x[0];
		for (int i=1; i<n; i++) {
			if (x[i] > max) 
				max = x[i];
		}
		return max;
	}
	
	public static void bucketSort(int x[], int n) {
		int m = findMax(x, n) + 1; // m contains the maximum value from the array 
		int count[] = new int[m]; // count contains the number of times each value in the array is repeated
		for (int i=0; i<n; i++)
			count[x[i]]++;
		int i = 0;
		for (int j=0; j<m; j++) {
			for (int k=0; k<count[j]; k++) 
				x[i++] = j;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i=0; i<n; i++) 
			x[i] = sc.nextInt();
		bucketSort(x, n);
		
		System.out.println("\nsorted array:");
		for(int i=0; i<n; i++) {
			System.out.print(x[i]+" ");
		}
	}
}