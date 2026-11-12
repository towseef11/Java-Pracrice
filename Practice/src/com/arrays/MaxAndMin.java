package com.arrays;

public class MaxAndMin {
//   public static void main(String[] args) {
//	 int arr[] = {1,3,4,5,21,2};
//	 int min = arr[0];
//	 int max = arr[0];
//	 for(int i=0;i<arr.length;i++) {
//		 if(arr[i]>max) {
//			 max=arr[i];
//		 }
//		 if(arr[i]<min ) {
//			 min=arr[i];
//			 
//		 }
//	 }
//	 System.out.println(max);
//	 System.out.println(min);
//}
	
	public static void main(String[] args) {
		int arr[] = {2,5,1,8,9,3};
		int min = arr[0];
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		
	}
}
