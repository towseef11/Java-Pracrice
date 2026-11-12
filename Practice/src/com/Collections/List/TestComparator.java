package com.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
         PlayerComparator pc1 = new PlayerComparator("Towseef", 88, 8);
         PlayerComparator pc2 = new PlayerComparator("Murari", 95, 7);
         PlayerComparator pc3 = new PlayerComparator("Saket", 90, 6);
         PlayerComparator pc4 = new PlayerComparator("Afrid", 88, 5);
         PlayerComparator pc5 = new PlayerComparator("Aman", 79, 4);
         PlayerComparator pc6 = new PlayerComparator("Thota", 84, 3);
         PlayerComparator pc7 = new PlayerComparator("Syam", 89, 5);
         
         List<PlayerComparator> al = new ArrayList<>();
         al.add(pc1);
         al.add(pc2);
         al.add(pc3);
         al.add(pc4);
         al.add(pc5);
         al.add(pc6);
         al.add(pc7);
         
         System.out.println("Before Sorting the List");
         for(PlayerComparator a : al) {
        	 System.out.println(a);
         }
         Comparator<PlayerComparator> c = new Comparator<PlayerComparator>() {

			@Override
			public int compare(PlayerComparator o1, PlayerComparator o2) {
				if(o1.score < o2.score) {
                	   return 1;
                   }
                   else if(o1.score > o2.score) {
                	   return -1;
                   }
                   else if(o1.score==o2.score) {
                	   return Integer.compare(o2.getLevel(), o1.getLevel());
                   }
                   else 
                	   return 0;
			}
        	 
         };
         System.out.println("-------------------");
         Collections.sort(al, c);
         System.out.println("After sorting : ");
         for(PlayerComparator p : al) {
        	 System.out.println(p);
         }
	}

	
}
