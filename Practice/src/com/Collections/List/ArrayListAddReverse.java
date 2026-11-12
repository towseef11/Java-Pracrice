package com.Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddReverse {
  public static void main(String[] args) {
	ArrayList<String> alsat =new ArrayList<>();
    alsat.add("Abdul");
    alsat.add("rahim");
    alsat.add("Mohammad");
    
    ArrayList<String> alsun = new ArrayList<>();
    alsun.add("towseef");
    alsun.add("murari");
    alsun.add("saket");
    
    alsat.addAll(alsun);
    Collections.reverse(alsat);
    System.out.println(alsat);
}
}
