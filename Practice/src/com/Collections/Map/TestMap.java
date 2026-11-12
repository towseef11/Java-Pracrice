package com.Collections.Map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(7, "Dhoni");
        m.put(18,"Virat");
        m.put(45,"Rohit");
        
       for(Map.Entry<Integer, String> entry:m.entrySet()) {
    	   System.out.println(entry.getKey()+" "+entry.getValue());
       }
        
//        System.out.println(m);
//        System.out.println(set);
	}
}
