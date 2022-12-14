package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] scores = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(scores));

        String result = Arrays.toString(scores);

        System.out.println(result);

        System.out.println("---------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

       boolean r1 =  Arrays.equals(a1, a2); //returns boolean

        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};
        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2); //false because they are in different order

        String[] s1 ={"A", "B", "C"};
        String[] s2 ={"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2));

        System.out.println("--------------------------------");

        //if the orders are different we can use sort method
        int[] nums = {100, 80, 90, 75, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums));// before sorting
        Arrays.sort(nums); // smallest number will be at index 0. it will not return an array, it will just sort
        System.out.println(Arrays.toString(nums));// after sorting

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);

        System.out.println("-----------------------------");

        String[] b1 ={"A", "B", "C"};
        String[] b2 ={"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1,b2)); // after sorting we are comparing if they have the same elements

        System.out.println("------------------------------");

        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students)); // if the first characters of the strings same then the next character will be compared
        //[Abidullah, Alena, Ali, Madiyar, Yaxier] --> after sorting

        System.out.println("-------------------------------");
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int[] array2 = Arrays.copyOf(array, 7); // we want array2 to include the same elements but we did not assign array to array2 because we do not want it to reference to same object we want to create an independent object with the same elements
        System.out.println(Arrays.toString(array2) +"array2");

        System.out.println("--------------------------------");

        //merging to arrays with copyOf() method. another approach
        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        //first
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        System.out.println(Arrays.toString(n3)); // [1, 2, 3, 4, 0, 0 ,0, 0, 0 ,0, 0]

        //second: create the to get all the elements of array n2 and assign it to the remaining indexes of the n3 array

        for (int i = 0, j=n1.length; i< n2.length; i++, j++) { // i: index number of n2. j: length of n1 is the remaining index of the n3, which is default zero we will start to merge starting from that index number
            n3[j]+=n2[i];
        }

        System.out.println(Arrays.toString(n3)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        System.out.println("------------------------------------");
        //copyOfRange Method
        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // index:     0    1    2    3    4    5    6
        char[] result1 = Arrays.copyOf(ch, 20); //copyOf() start to copy from the first element
        System.out.println(Arrays.toString(result1)); //[A, B, C, D, E, F, G,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]

        char[] result2 = Arrays.copyOfRange(ch, 2, 4);
        System.out.println(Arrays.toString(result2)); //[C, D] , it will exclude the element at index 4

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length); //we gave length as an ending index to copy the last element at the last index
        System.out.println(Arrays.toString(result3)); ///[C, D, E, F, G]





    }
}
