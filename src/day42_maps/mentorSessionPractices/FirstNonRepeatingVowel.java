package day42_maps.mentorSessionPractices;

import java.util.*;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingVowel("responsible"));

    }

    public static int firstNonRepeatingVowel(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), (str.charAt(i)+""));
            map.put(str.charAt(i), frequency);
            map2.put(str.charAt(i), frequency);
        }

        System.out.println(map);
        System.out.println(map2);


        int result=-1;
        for (Character eachKey : map2.keySet()) {
            if (eachKey == 'a' || eachKey == 'e' || eachKey == 'o' || eachKey == 'u') {
                if (map2.get(eachKey) == 1) {
                    result = str.indexOf(eachKey);
                    break;
                }
            }
        }
        return result;
    }
}




