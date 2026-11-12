package com.arrays;

public class AntiClockwiseRotation {
   public static void main(String[] args) {
	int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr[i].length;j++) {
			int temp = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = temp;
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	for(int j=0;j<arr.length;j++) {
		int start = 0;
		int end = arr[j].length-1;
		while(start<end) {
			int temp = arr[start][j];
			arr[start][j] = arr[end][j];
			arr[end][j] = temp;
			start++;
			end--;
		}
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
