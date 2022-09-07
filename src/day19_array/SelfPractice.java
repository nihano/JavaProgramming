package day19_array;

import java.util.Arrays;

public class SelfPractice {
    public static void main(String[] args) {

        int[] nums = new int[26];

        for (int i = 0, j=0; i < nums.length; i++, j+=2) {
            nums[i]=j;
        }

        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("------------------------------------------");


        int num1 = 0;
        int num2 = 2;
        int num3 = 4;
        int num4 = 6;

        System.out.println(num1 + ", " + num2 + ", "+ num3 + ", "+ num4);

        int[] nums2 = {0, 2, 4, 6};
        System.out.println(Arrays.toString(nums2));

        System.out.println("------------------------------");

        int[] nums3 = new int[4];
        nums3[0] = 0;
        nums3[1] = 2;
        nums3[2] = 4;
        nums3[3] = 6;
        System.out.println(Arrays.toString(nums3));

        System.out.println("------------------------------------");

        // array list numbers from 0 to 100--> print 100, 98, 96......

        int[] nums4 = new int[51];

        for (int i = nums4.length-1, j=0; i >= 0; i--, j+=2) {
            nums4[i]=j;
        }
        System.out.println(Arrays.toString(nums4));

        System.out.println("----------------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        int[] a3 = a2;

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));

        System.out.println("--------------------------------------------");

        String[] str1 = {"James", "Kirk"};

        str1 = new String[]{"Vince", "Nikki"};

        System.out.println(Arrays.toString(str1));

        System.out.println("----------------------------------------------");

        char[] chars = new char[26];

        for (int i = chars.length - 1, j='A'; i >= 0; i--, j++) {
            chars[i] = (char)j;
        }
        System.out.println(Arrays.toString(chars));


    }





}
