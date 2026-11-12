package com.arrays;

public class Spiral {
   public static void main(String[] args) {
	int a[][] = {{1,2,3},
			     {4,5,6},
			     {7,8,9}};
	int  top = 0;
	int buttom = a.length-1;
	int left = 0;
	int right = a[0].length-1;
	while(top<=buttom && left<=right) {
		for(int i=left;i<=right;i++) {
			System.out.print(a[top][i]+" ");
		}
		top++;
		for(int i=top;i<=buttom;i++) {
			System.out.print(a[i][right]+" ");
		}
		right--;
		for(int i=right;i>=left;i--) {
			System.out.print(a[buttom][i]+" ");
		}
		buttom--;
		for(int i=buttom;i>top;i++) {
			System.out.print(a[i][left]+" ");
		}
		left++;
	}
	
}
}
