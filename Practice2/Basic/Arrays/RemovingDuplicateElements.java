package Arrays;

public class RemovingDuplicateElements {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,20,10};
        boolean visited[] = new boolean[arr.length];
        
        for(int i=0 ; i<arr.length; i++){
            
            if(visited[i])
                continue;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                   
                }         
            }
            // if(count==1)
            //     System.out.print(arr[i]+" ");
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(!visited[i])
                System.out.print(arr[i]+" ");
        }

    }
    
}
