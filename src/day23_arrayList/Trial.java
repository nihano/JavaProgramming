package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Trial {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));

        for (int i = 0; i<list.size(); i++){
            if (list.get(i)<=4){
                list.remove(i);
                i-=1;
            }
        }

        System.out.println(list);


    }


}
