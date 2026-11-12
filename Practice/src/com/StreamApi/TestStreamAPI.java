package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStreamAPI {
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
	   int arr[] = new int[size];
	   
	   for(int i=0;i<size;i++) {
		   arr[i] = sc.nextInt();
	   }
	   
	   
	   
	   int secondMax = Arrays.stream(arr)
			           .distinct()
			           .boxed()
			           .sorted((a,b)->b-a)
			           .skip(1)
			           .findFirst()
			           .get();
	   
	   System.out.println(secondMax);
   }
}
