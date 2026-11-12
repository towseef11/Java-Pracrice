package Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {10,0,20,0,0,30,0};
        int index = 0;

        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length){
            arr[index] = 0 ;
            index++;
        }

        for (int a : arr){
            System.out.println(a+" ");
    }
}
}