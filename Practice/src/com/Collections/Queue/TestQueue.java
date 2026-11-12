package com.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(25);
        q.add(10);
        q.add(20);
        q.offer(30);
        
        System.out.println(q.element());
        System.out.println(q);
	}
}
