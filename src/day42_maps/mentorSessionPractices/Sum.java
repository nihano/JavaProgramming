package day42_maps.mentorSessionPractices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sum {

    public static void main(String[] args) {

        Map<Integer, Double> newMap = new TreeMap<>();
        Map<Integer, Double> seriesA = new TreeMap<>();
        Map<Integer, Double> seriesB = new TreeMap<>();

        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);

        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);

        for (Integer eachKey : seriesA.keySet()) {
            for (Integer eachKey2 : seriesB.keySet()) {
                if (eachKey.equals(eachKey2)){
                    newMap.put(eachKey, seriesA.get(eachKey)+seriesB.get(eachKey2));
                }else if (!seriesB.containsKey(eachKey)){
                    newMap.put(eachKey, seriesA.get(eachKey));
                } else if (seriesA.containsKey(eachKey2)) {
                    newMap.put(eachKey2, seriesB.get(eachKey2));
                }
            }
        }

        System.out.println(newMap);


    }



}
