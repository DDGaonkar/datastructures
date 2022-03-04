import java.util.*;
import java.io.*;

class Solution {
	
	static void insertionSort(int x[], int n) {
		int val, j;
		for(int i=0; i<n-1; i++) {
			val = x[i+1];
			for(j=i; j>=0; j--)
				if(x[j] > val)
					x[j+1] = x[j];
				else
					break;
			x[j+1] = val;
			System.out.print("\n"+i+" interation:\n");
			for(int k=0; k<n; k++) {
				System.out.print(x[k]+" ");
			}
		}
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements:");
			int n = sc.nextInt();
			int[] x = new int[n];
			for(int i=0; i<n; i++) 
				x[i] = sc.nextInt();
			insertionSort(x, n);
			
			System.out.println("\nsorted array:");
			for(int i=0; i<n; i++) {
				System.out.print(x[i]+" ");
			}
	}
}