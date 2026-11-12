package com.InfosysPrep;

public class MaxProfit {
	public static void main(String[] args) {
		int arr[] = {7,2,3,4,6,1};
		int min = arr[0];
		int maxprofit = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			else {
				int profit = arr[i] - min;
				maxprofit = Math.max(maxprofit,profit);
			}
			
		}
		System.out.println(maxprofit);
	}
}
