package com.LeetCode;

public class problem1 {

	public int findDistance(String moves) {
         int distance = 0;
         for(int i=0;i<moves.length();i++) {
        	 char ch = moves.charAt(i);
        	 if(ch=='L') distance -=1;
        	 else if (ch=='R') distance +=1;
        	 else distance +=1;
         }
         return distance;
	}

	public static void main(String[] args) {
      String moves = "LL__RR_";
      problem1 p =new problem1();
      System.out.println(p.findDistance(moves));
	}
}
