package Arrays;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50};
        int arr2[] = {30,30,40,60,70};
        boolean visited1[] = new boolean[arr1.length];
        boolean visited2[] = new boolean[arr2.length];

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = i+1 ; j<arr1.length; j++ ){
                if(arr1[i]==arr1[j]){
                    visited1[j] = true;
                }
            }    
        }

         for(int i = 0 ; i < arr2.length ; i++){
            for(int j = i+1 ; j<arr2.length; j++ ){
                if(arr2[i]==arr2[j]){
                    visited2[j] = true;
                }
            }    
        }
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j] && !visited1[i] && !visited2[j]){
                   System.out.print(arr1[i]+" "); 
                   break;
                }
            }
        }
    }
}
