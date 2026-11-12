package com.StreamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,20,40);
		Set<Integer> set = new HashSet<>();
				
		Set<Integer> duplicates = list.stream()
		                   .filter(x -> !set.add(x))
		                   .collect(Collectors.toSet());
		System.out.println(duplicates);
	}
}
