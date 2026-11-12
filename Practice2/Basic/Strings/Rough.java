package Strings;

public class Rough {
    public static void main(String[] args) {
        String s = "aacbb";
        boolean found = false;
        
        for( int i = 0 ; i < s.length() ; i++){
            int count = 0;
            for(int j = 0; j < s.length() ; j++){
                if(i !=j && s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count == 0 ){
                System.out.println("First non repeating element is : "+s.charAt(i));
                found = true;
                break;
            }

        }
        if(!found)
            System.out.println("No repeting characters in String !!");
    }    
}
