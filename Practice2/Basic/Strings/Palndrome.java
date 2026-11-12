package Strings;

import java.util.Scanner;

public class Palndrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();

        String reversed = "";

        for(int i = s.length()-1 ; i >= 0 ; i--){
            reversed = reversed + s.charAt(i);
        }

        if(s.equals(reversed))
            System.out.println("Palindrome !");
        else
            System.out.println("Not a Palindrome !");
        sc.close();

    }    
}
