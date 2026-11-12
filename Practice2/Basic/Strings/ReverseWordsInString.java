package Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Java is fun";
        String result = "";
        int start = 0;
        int end = 0;
        
        for( int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)==' '){
                end = i-1;
                while(start<=end){
                    result = result + s.charAt(end);
                    end--;
                }
                result = result + s.charAt(i);
                start = i + 1;
            }
            if(i==s.length()-1){
                end = i;
                while(start<=end){
                    result = result + s.charAt(end);
                    end--;
                }
            }
            
        }
        System.out.println(result);
    }    
}
