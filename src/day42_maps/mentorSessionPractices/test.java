package day42_maps.mentorSessionPractices;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        Map<Integer, Double> map1 = new LinkedHashMap<>();
        map1.put(1, 1.0);
        map1.put(2, 1.5);
        map1.put(3, 2.0);
        map1.put(null, null);

        List<Integer> listKeys = new ArrayList<>();
        List<Double> listValues = new ArrayList<>();
        for (Map.Entry<Integer, Double> eachEntryMap1 : map1.entrySet()) {
            listKeys.add(eachEntryMap1.getKey());
        }

        System.out.println(listKeys);
    }
}
