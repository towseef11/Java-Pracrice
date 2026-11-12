package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> num = List.of(10,20,30,40,50);

        //for loop 
        for(int i = 0 ; i < num.size() ; i++){
            System.out.print(num.get(i)+" ");
        }
        System.out.println();

        //for each
        for(int n : num ){
            System.out.print(n + " ");
        }
        System.out.println();

        //iterator
        Iterator<Integer> itr = num.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

        
    }
}
