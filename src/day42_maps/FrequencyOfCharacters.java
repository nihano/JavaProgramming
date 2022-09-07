package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
            map.put(each.charAt(0),frequency); //we converted string to character because key is Character in the Map for no reason

           // each.charAt(0); to convert String to char
        }
        System.out.println(map);


        /*

        MY SOLUTION

        //get each character and frequency
        //add character as a key and frequency as value

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), count);
            }
        }
        System.out.println(map);
         */
    }
}

/*
1. Write a program that can return the frequency of characters
            Not: MUST use map
                Ex: str = "bbcccaaaaa"
                output:
                    {b=2, c=3, a=5}
 */
