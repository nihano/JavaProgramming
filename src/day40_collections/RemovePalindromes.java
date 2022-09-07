package day40_collections;

import utilities.StringUtility;

import java.util.*;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int i = each.length()-1; i>=0; i--){
                reverse +=each.charAt(i);

            }
            if (each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("----------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p)); // we have our own method in StringUtility Class
        System.out.println(names2);

        System.out.println("----------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );
        names3.removeIf(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));
        System.out.println(names3);
        //CHECK SHORT VIDEOS FOR StringBuilder, StringBuffer etc.


    }

}
