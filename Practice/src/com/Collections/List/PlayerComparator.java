package com.Collections.List;

public class PlayerComparator {
      String name ;
      int score;
      int level;
      
      public PlayerComparator(String name, int score, int level) {
    	  this.name = name;
    	  this.score = score;
    	  this.level = level;
      }
      
      @Override
      public String toString() {
    	  return " Name : "+name+" Score : "+score+" Level : "+level;
      }
      
      
      public String getName() {return name;}
      public int getScore() {return score;}
      public int getLevel() {return level;}
}
