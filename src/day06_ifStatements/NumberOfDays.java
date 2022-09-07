package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int n = 1;

        boolean has28Days = n==2;
        boolean has30Days = n==4 || n==6 || n==9|| n==11;
        boolean has31Days = !has28Days && !has30Days; //if the month does not have 28 days, also does not have 30 days, then the month has 31 days

        String result = "";

        if (has28Days){
            result = "28 Days";
        }

        if (has30Days){
            result = "30 Days";
        }

        if (has31Days){
            result ="31 Days";
        }

        System.out.println(result);



    }
}
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a program that can print the number of days in the given month
Ex: Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12 Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */