package day40_collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {


       Collection<Integer> collection = new ArrayList<>();

       collection.add(100);
       collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);
        System.out.println( ( (ArrayList)collection ).get(2) );

       // System.out.println( ((Stack)collection).pop() ); no "IS A relationship" class cast exception

        System.out.println("-----------------------------------------");

        Collection<Integer> collection2 =  new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);

        // System.out.println( ((ArrayList)collection2).get(4) ); ClassCastException

        System.out.println( new ArrayList<>(collection2).get(4)); // if there is no IS A relationship we cannot cast, but we can use ArrayList constructor because it takes collection type, so we pass the other collection as an argument in the constructor
        List<Integer> l = new ArrayList<>(collection2); // if we are going to use the variable multiple times we can assign it to a variable


    }
}
