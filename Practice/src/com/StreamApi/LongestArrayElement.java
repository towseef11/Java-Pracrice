package com.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestArrayElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","spring","microservices");
		Optional<String> longg = list.stream()
		     .max(Comparator.comparingInt(String::length));
		     
		System.out.println(longg);
				       
	}
}
