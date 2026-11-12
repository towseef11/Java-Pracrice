package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Rough {
    //Itrator
    // public static void main(String[] args) {
    //     List<String> names = new ArrayList<>(List.of("Towseef","Abbas","Qalb"));
    //     Iterator<String> itr = names.iterator();

    //     while(itr.hasNext()){
    //         String s = itr.next();
    //         if(s.contains("eef"))
    //             itr.remove();
    //     }

    //     System.out.println(names);
    // }

    //List Iterator
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Towseef","Abbas","Qalb"));
        ListIterator<String> litr = names.listIterator();

        // while(litr.hasNext()){
        //     String s = litr.next();
        //     if(s.contains("eef"))
        //         litr.set("roohi");
        // }

        for(String s : names){
            if(s.contains("eef"))
                s = "Roohi";
        }

        
        System.out.println(names);
    }
}
