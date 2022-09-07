package day42_maps.mentorSessionPractices;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntisarsSolution {

        public static void main(String[] args) {

            System.out.println(frequencyOfChars(null));
        }

        public static Map<Character, Integer> frequencyOfChars(String str) {
            Map<Character, Integer> map = new LinkedHashMap<>();
                if (str==null) {
                System.out.println("String is null ");
                System.exit(1);

            } else if (str.isEmpty()) {
                System.out.println("String is Empty ");
                System.exit(1);
            } else {

                for (int i = 0; i < str.length(); i++) {
                    int frequency = Collections.frequency(Arrays.asList(str.split("")), (str.charAt(i) + ""));
                    map.put(str.charAt(i), frequency);
                }
                //System.out.println(map);

            }
            return map;
        }

    }

