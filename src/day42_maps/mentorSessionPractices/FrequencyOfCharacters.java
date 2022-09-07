package day42_maps.mentorSessionPractices;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class FrequencyOfCharacters {

    public static void main(String[] args) {

        frequencyOfCharacters((Object) "google");
    }

    public static Map<Character, Integer> frequencyOfCharacters(Object str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.toString().length(); i++) {

            if (str.equals("")) {
                map.clear();
            } else {
                int frequency = Collections.frequency(Arrays.asList(str.toString().split("")), (str.toString().charAt(i) + ""));
                map.put(str.toString().charAt(i), frequency);
            }
        }
        System.out.println(map);
        return map;
    }

    public static void frequencyOfCharacters(String str){
        if (str==null){
            System.out.println("null");
        }
    }


}





