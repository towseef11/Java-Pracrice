package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class SumofSquaresofEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		int sum = list.stream()
				 .filter(x->x%2==0)
				 .map(x->x*x)
				 .reduce(0,(a,b)->a+b);
		
		System.out.println(sum);
				 
	}
}