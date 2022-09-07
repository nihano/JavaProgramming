package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> HashMap = new HashMap<>(); // random order, accepts null key & null values
        HashMap.put("Daniel", 95000);
        HashMap.put("Emily", 100000);
        HashMap.put("Bella", 85000);
        HashMap.put("Daniel", 105000);
        HashMap.put("Daniel", 75000);
        HashMap.put("Daniel", 80000); // last added one will be stored
        HashMap.put("Aaron", 78000);
        HashMap.put("Chris", null);
        HashMap.put("Breanna", null);
        HashMap.put(null,120000);
        HashMap.put(null,110000);
        HashMap.put(null,100000); //last will be kept
        System.out.println("HashMap = " + HashMap); //{Emily=100000, Daniel=80000, Bella=85000}

        System.out.println("-----------------------------------------");

        Map<String, Integer> LinkedHashMap= new LinkedHashMap<>(); // insertion order, accepts null key & null values

        LinkedHashMap.put("Daniel", 95000);
        LinkedHashMap.put("Emily", 100000);
        LinkedHashMap.put("Bella", 85000);
        LinkedHashMap.put("Daniel", 105000);
        LinkedHashMap.put("Daniel", 75000);
        LinkedHashMap.put("Daniel", 80000);
        LinkedHashMap.put("Aaron", 78000);
        LinkedHashMap.put("Chris", null);
        LinkedHashMap.put("Breanna", null);
        LinkedHashMap.put(null,120000);
        LinkedHashMap.put(null,110000);
        LinkedHashMap.put(null,100000);

        System.out.println("LinkedHashMap = " + LinkedHashMap);

        System.out.println("---------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key, accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Daniel", 105000);
        treeMap.put("Daniel", 75000);
        treeMap.put("Daniel", 80000);
        treeMap.put("Aaron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
        //treeMap.put(null,120000);
        //treeMap.put(null,110000);
        //treeMap.put(null,100000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("---------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does not accept null key & values,  synchronized

        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Daniel", 105000);
        hashtable.put("Daniel", 75000);
        hashtable.put("Daniel", 80000);
        hashtable.put("Aaron", 78000);
        //hashtable.put("Chris", null); Value in Hashtable cannot be null
        //hashtable.put("Breanna", null); Value in Hashtable cannot be null
        //hashtable.put(null,120000); Key in Hashtable cannot be null
        //hashtable.put(null,110000); Key in Hashtable cannot be null

        try{
            hashtable.put(null,100000); // it will not be added to hashtable but program is not going to be crashed
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("hashtable = " + hashtable);


    }

    /*
    pair: name & salary
    Daniel = 95000
    Emily = 100000
    Bella = 85000





     */

}
