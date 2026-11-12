package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class TotalLengthofAllStreams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "spring", "boot", "microservices", "sql");
		
		int totalLength = list.stream()
				          .filter(x->x.length()>4)
				          .mapToInt(String::length)
				          .sum();		
		System.out.println(totalLength);
	}
}
