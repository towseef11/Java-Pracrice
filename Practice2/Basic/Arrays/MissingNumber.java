package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
           
            sum+=arr[i];
        }
        int totalshould = (n * (n+1))/2;
        System.out.println("Misising number is : "+ (totalshould - sum));

    }
}
