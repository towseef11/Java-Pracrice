package com.arrays;

public class DuplicateAndFrequency {
	public static void main(String[] args) {
		int a[] = {1,2,3,1,5,2,3};
		boolean visited[] = new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(visited[i])
				continue;
			
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
			}
			
			System.out.print(a[i]+" -> "+count+" time");
			if(count == 1) System.out.print("");
			else System.out.println("s");
			System.out.println();
		}
	}
}
