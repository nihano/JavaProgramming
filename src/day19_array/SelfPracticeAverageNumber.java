package day19_array;

import java.util.Scanner;

public class SelfPracticeAverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int answer = input.nextInt();

        int[] numbers =  new int[answer];
        int sum =0;
        for (int i = 0; i < answer; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum+= numbers[i];
        }

        System.out.println(sum);

        double average = sum/ numbers.length;

        System.out.println(average);








    }
}
