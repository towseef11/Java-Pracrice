package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi1 {
    public static void main(String args[]) {
    	List<Integer> arr = Arrays.asList(1,2,3,4,4,5);
    	arr.stream().distinct().forEach(System.out::println);
    }
}
