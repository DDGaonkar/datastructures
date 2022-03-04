import java.util.*;
import java.io.*;
class Solution {

	static void bubbleSort(int x[], int n) {
		// if value of exchange is not changed then the array is already sorted  
		int exchange = 1, temp;
		for(int i=0; i<n-1 && exchange==1; i++) {
			exchange = 0;
			for(int j=0; j<n-1; j++) {
				if(x[j] > x[j+1]) { 
					exchange = 1;
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
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
		//accepting n elements in array 
		for(int i=0; i<n; i++)
			x[i] = sc.nextInt();
		bubbleSort(x, n);
		System.out.println("\nsorted array:");
		for(int i=0; i<n; i++)
			System.out.print(x[i]+" ");
	}
}