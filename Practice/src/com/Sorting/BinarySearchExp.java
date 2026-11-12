package com.Sorting;

public class BinarySearchExp {
  public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8};
	int target = 6;
	
	int start = 0;
	int end = arr.length-1;
	boolean found = false;
	while(start<end) {
		int mid = (start+end)/2;
		if(target == arr[mid]) {
			System.out.println("Element found at "+mid);
			found = true;
			return;
		}
		else if(target > mid) {
			start = mid+1;
		}
		else {
			end = end-1;
		}
	}
	if(!found) {
		System.out.println("element not found!");
	}

}
}
