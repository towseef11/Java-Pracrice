package Arrays;

public class TargetNumberPairs {

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15, 3, 6};
        int target = 9;

        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("("+arr[i]+" "+arr[j]+")");
                    System.out.println();
                }
            }
        }
    }
    
}
