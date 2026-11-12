package Strings;

import java.util.Scanner;

public class Occurance {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Towseef
        System.out.println("Enter a word");
        String s = sc.nextLine();
        s=s.toLowerCase();
 
        System.out.println("Enter a ");
        char target = sc.next().charAt(0); 

        int count = 0;

        for(int i = 0 ; i < s.length() ; i++ ){
            if(s.charAt(i)==target)
                count++;
        }

        System.out.println("Occurances : "+count);
        sc.close();
    }
}
