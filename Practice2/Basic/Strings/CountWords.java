package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance ");

        String sentance = sc.nextLine();
        int count = 0;

        for(int i = 0 ; i<sentance.length() ; i++){
            char c = sentance.charAt(i);
            if(c!=' '&&(i==0 || sentance.charAt(i-1)==' ')){
                count++;
            }
        }
        
        System.out.println("Number of words are : "+count);
        sc.close();
    }
}
