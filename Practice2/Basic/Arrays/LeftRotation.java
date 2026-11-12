package Arrays;

public class LeftRotation {


    public static int[] rev(int arr[],int start,int end){
            int temp = 0;
            while(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return arr ;
    }
    public static void main(String[] args) {
        int arr[ ]= {10,20,30,40,50};
        int k = 9;
        // int pos =1;
            rev(arr, 0 , k%arr.length-1);
            rev(arr, k % arr.length ,arr.length-1);
            rev(arr,0,arr.length-1);
        
        /** 40 30 20 10 50 60 70 80
         * 40 30 20 10 80 70 60 50 
         * 50 60 70 80 10 20 30 40  
        */
        
        
        
        for(int a : arr){
            System.out.print(a+" ");
        }
        
        
    }
}
