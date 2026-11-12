package com.InfosysPrep;

public class MaxConsecutive1 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 1, 0, 1 };
		int maxcount = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count += 1;
				if (count > maxcount)
					maxcount = count;
			}
			if (arr[i] == 0) {
				count = 0;
			}
		
		}
		System.out.println(maxcount);
	}

}
