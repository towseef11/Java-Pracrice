package Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40, 10, 50};
        boolean visited[] = new boolean[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            int count = 1;
            if(visited[i])
                continue;
            
            for( int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > 1)
                System.out.println(arr[i]);
        }
    }
}
