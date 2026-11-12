package com.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ListtoSet implements Comparable<ListtoSet> {
	
    int id ;
    double price;
    String name;
    
    public ListtoSet(int id, double price, String name) {
    	this.id = id;
    	this.price = price;
    	this.name = name;
    }
	
    @Override
    public String toString() {
    	return "["+id+", "+ price+", "+name+"]";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListtoSet ticket = (ListtoSet) o;
        return id == ticket.id; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public int compareTo(ListtoSet other) {
        return Integer.compare(this.id, other.id);
    }
    
	public static Set<ListtoSet> scan(List<ListtoSet> l) {
		Set<ListtoSet> scan = new HashSet<>();
        Set<ListtoSet> duplicates = new TreeSet<>();
        
        for(ListtoSet l1:l) {
           if(!scan.add(l1)) {
        	   duplicates.add(l1);
           }
        }
		return duplicates;
	}
	
	public static void main(String[] args) {
       List<ListtoSet> list  = new ArrayList<>();
       
       list.add(new ListtoSet(101,200.0,"Murari"));
       list.add(new ListtoSet(101,200.0,"Saket"));
       list.add(new ListtoSet(102,200.0,"Afrid"));
       list.add(new ListtoSet(102,200.0,"Thota"));
       list.add(new ListtoSet(103,200.0,"Aman"));
       
       System.out.println("Duplicate ticket id's are : "+scan(list));
       
	}
}
