package Arrays;

public class UnionOfElements {
    public static void main(String[] args) {
        int arr1[] = {10,20,30,40,50};
        int arr2[] = {40,50,60,70};
        boolean visited1[] = new boolean[arr1.length];
        boolean visited2[] = new boolean[arr2.length];

        for(int i = 0 ; i < arr1.length ; i++){
            if(visited1[i])
                continue;
            for(int j = i+1 ; j <arr1.length ; j++){
                if(arr1[i]==arr1[j]){
                    visited1[j] = true;
                }
            }
        }

        for(int i = 0 ; i < arr2.length ; i++){
            if(visited2[i])
                continue;
            for(int j= i+1; j<arr2.length ; j++){
                if(arr2[i]==arr2[j]){
                    visited2[j] = true;
                }
            }
        }

        int arr[] = new int[arr1.length + arr2.length];

        for(int i = 0; i< arr1.length ; i++){
            if(!visited1[i])
                arr[i]=arr1[i];
        }

        for(int i = 0 ; i < arr2.length ; i++){
            if(!visited2[i])
                arr[i]=arr2[i];
        }

        for(int a : arr){
            System.out.print(a+" ");
        }

    }    
}
