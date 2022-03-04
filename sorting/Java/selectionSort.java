import java.util.*;
import java.io.*;

class Solution {

	static void selectionSort(int x[], int n) {
		int min, pos;
		for(int j=0; j<n-1; j++) {
			min = x[j];
			pos = j;
			for(int i=j+1; i<n; i++) {
				if(min > x[i]) {
					min = x[i];
					pos = i;
				}
			}
			x[pos] = x[j];
			x[j] = min;
			System.out.print("\n"+j+" interation:\n");
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
		selectionSort(x, n);
		
		System.out.println("\nsorted array:");
		for(int i=0; i<n; i++) {
			System.out.print(x[i]+" ");
		}
	}
}