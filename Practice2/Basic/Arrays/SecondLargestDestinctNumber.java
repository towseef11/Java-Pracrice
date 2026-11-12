package Arrays;

public class SecondLargestDestinctNumber {

    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 8, 20, 15};
        int max = arr[0];
        int secmax = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }  
            else if(arr[i]>secmax && arr[i]<max){
                secmax = arr[i];
            }
        }

        System.out.println(secmax);
    }
    
}
