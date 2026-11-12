package Arrays;

public class NonDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {5, 7, 5, 8, 7, 5, 9};
        boolean[] unq = new boolean[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            if(unq[i])
                continue;

            int count = 1 ;
            for(int j = i+1 ; j<arr.length ;j++){
                if(arr[i]==arr[j]){
                    count++;
                    unq[j] = true;
                }
            }

            if(count ==1)
               System.out.println(arr[i]);
    
        }

    }   
}
