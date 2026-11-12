package com.InfosysPrep;

public class FindingDuplicates {
   public static void main(String[] args) {
	 int arr[] = {2,2,1,1,2,2,2};
	 boolean visited[] = new boolean[arr.length];
	 for(int i=0;i<arr.length;i++) {
		 
		 if(visited[arr[i]]) {
			 System.out.print(arr[i]);
			 break;
		 }
				 visited[arr[i]] = true;
	 }
}
}
