package com.Strings;

public class ElementsCountinString {
   public static void main(String[] args) {
	String s = "Towseeff@123";
	int Capcount = 0;
	int smallcount = 0;
	int digicount = 0;
	
	for(int i = 0 ; i < s.length() ; i++ ) {
		if(Character.isUpperCase(s.charAt(i))) Capcount++;
		else if(Character.isLowerCase(s.charAt(i))) smallcount++;
		else if(Character.isDigit(s.charAt(i))) digicount++;
	}
	System.out.println("Upper Case : "+Capcount);
	System.out.println("Lower Case : "+smallcount);
	System.out.println("Digits : "+digicount);
}
}
