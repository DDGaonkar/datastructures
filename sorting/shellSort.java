 import java.util.*;
 import java.io.*;

 class Solution {
 	
 	static void shellSort(int x[], int n) {
 		int j, val;
 		for(int inc=n/2; inc>=1; inc=inc/2) {
 			for(int k=0; k<inc; k++) {
 				for(int i=k; i<n-inc; i=i+inc) {
 					val = x[i+inc];
 					for(j=i; j>=k; j=j-inc)
 						if(x[j] > val)
 							x[j+inc] = x[j];
 						else
 							break;
 					x[j+inc] = val;
 				}
 			}
 			// System.out.println();
 			// for(int g=0; g<n; g++) {
 			// 	System.out.print(x[g]+" ");
 			// }
 		}
 	}

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements:");
			int n = sc.nextInt();
			int[] x = new int[n];
			for(int i=0; i<n; i++) 
				x[i] = sc.nextInt();
			shellSort(x, n);
			
			System.out.println("\nsorted array:");
			for(int i=0; i<n; i++) {
				System.out.print(x[i]+" ");
			}
 	}
 }