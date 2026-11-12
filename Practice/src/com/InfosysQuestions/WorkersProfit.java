package com.InfosysQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


class Task {
    int difficulty;
    int profit;

    Task(int difficulty, int profit) {
        this.difficulty = difficulty;
        this.profit = profit;
    }
}

public class WorkersProfit {
	 
	public static int solve(Task task[] , int workers[],int n) {
		Arrays.sort(task,(a,b)->a.difficulty-b.difficulty);
		
		Arrays.sort(workers);
	
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		
		int i = 0;
		int totalprofit = 0;
		for(int w:workers) {
			
			
			while(i<n && w >= task[i].difficulty) {
				maxheap.add(task[i].profit);
				i++;
			}
			if(!maxheap.isEmpty()) {
				totalprofit +=maxheap.poll();
			}
		}
		return totalprofit;

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int n = sc.nextInt();
		Task task[] = new Task[n];
		for(int i=0;i<n;i++) {
			int d = sc.nextInt();
			int w = sc.nextInt();
			task[i] = new Task(d,w);
					
		}
		
		int m = sc.nextInt();
		int workers[] = new int[m];
		for(int i=0;i<m;i++) {
			workers[i] = sc.nextInt();
		}
		int result = solve(task,workers,n);
		System.out.println(result);
	}
}
