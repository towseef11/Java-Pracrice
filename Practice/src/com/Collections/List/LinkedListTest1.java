package com.Collections.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest1 {
  public static void main(String[] args) {
	List<Integer> list = new LinkedList<>();
	list.add(5);
	list.add(12);
	list.add(10);
	list.add(7);
	list.add(10);
	list.add(14);
	
	ListIterator<Integer> litr = list.listIterator();
	while(litr.hasNext()) {
		int ele = litr.next();
		if(ele%2==1) {
			litr.set(0);
		}
		else if(ele==10) {
			litr.remove();
		}
		
	}
	
	System.out.println(list);
	}
}
