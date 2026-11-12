package com.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
   public static void main(String[] args) {
	Map<Integer,String> map = new LinkedHashMap<>();
	map.put(null, "null");
	map.put(1, "Towseef");
	map.put(2, "Mullu");
	System.out.println("Before = "+map);
	
    for(Map.Entry<Integer,String> m : map.entrySet()) {
    	if("mullu".equalsIgnoreCase(m.getValue())) {
    		m.setValue("Murari");
    	}
    }
    System.out.println("After = "+map);
}
}
