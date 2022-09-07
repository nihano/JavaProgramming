package day19_array;

import java.beans.beancontext.BeanContext;

public class SelfPracticeMaxMin {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 2, 9, 10, 2, 11, 3};

        int max = 1;
        /*for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println(max);
         */

        for (int each : numbers) {
            if (each>max){
                max=each;
            }

        }

        System.out.println(max);

    }
}
