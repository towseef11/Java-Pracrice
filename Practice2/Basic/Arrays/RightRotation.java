package Arrays;

public class RightRotation {

    public static int[] rev(int[] arr, int start, int end){
        int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int k = 2;
        /*
            10 20 30 50 40
            30 20 10 50 40
            40 50 10 20 30  
        */
        rev(arr, arr.length-k, arr.length-1);
        rev(arr, 0, arr.length-k-1);
        rev(arr, 0, arr.length-1);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }    
}
