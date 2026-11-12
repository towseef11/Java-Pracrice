package Arrays;

public class TargetElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 60};
        int target = 60;
        int index = 0;
        boolean found = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==target){
                found = true;
                index = i;
                break;
            }         
                
        }
        if(found)
            System.out.println("Element found at index : "+index);
        else
        System.out.println("Element not found !!");
    }
}
