package com.Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(8, "murari");
        map.put(9, "Saket");
        map.put(1, "Towseef");
        map.put(5, "Thota");
        map.put(3, "Afrid");
        map.put(4,"Aman");
        System.out.println(map);
	}
}
