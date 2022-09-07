package day42_maps.mentorSessionPractices;

import java.util.LinkedHashMap;
import java.util.Map;

public class SummationOfTwoTimeSeries {

    public static Map<Integer, Double> summationOfTwoTimeSeries(Map<Integer, Double> map1, Map<Integer, Double> map2) {

        //map1.put(1, 1.0);
        //map1.put(2, 1.5);
        //map1.put(3, 2.0);
        //map1.put(null, null);

        //map2.put(null, null);
        //map2.put(2, 1.0);
        //map2.put(3, 2.5);
        //map2.put(5, 1.0);

        Map<Integer, Double> newMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> eachEntryMap1 : map1.entrySet()) {
            for (Map.Entry<Integer, Double> eachEntryMap2 : map2.entrySet()) {
                Integer map1EachKey = eachEntryMap1.getKey();
                Integer map2EachKey = eachEntryMap2.getKey();
                Double map1EachValue = eachEntryMap1.getValue();
                Double map2EachValue = eachEntryMap2.getValue();

                if (map1EachKey!=null && map2EachKey!=null){
                    newMap.put(map1EachKey, map1EachValue+map2EachValue);
                }

            }

        }
        return newMap;
    }


        public static void main (String[]args){

            Map<Integer, Double> map1 = new LinkedHashMap<>();
            Map<Integer, Double> map2 = new LinkedHashMap<>();
            map1.put(1, 1.0);
            map1.put(2, 1.5);
            map1.put(3, 2.0);
            map1.put(null, null);

            map2.put(null, null);
            map2.put(2, 1.0);
            map2.put(3, 2.5);
            map2.put(5, 1.0);
            System.out.println(summationOfTwoTimeSeries(map1, map2));
        }

    }


