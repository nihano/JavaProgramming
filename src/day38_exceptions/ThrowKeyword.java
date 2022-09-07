package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: " + age);
            } else {
                throw new InputMismatchException("Age of the person cannot be greater than 150: " + age);
            }
        }

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("--------------------------------------");

        //throw new RuntimeException("Runtime exception"); // after throwing an exception we cannot give any code fragment
        //System.out.println("Hello World"); unreachable statement

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }

        System.out.println("-------------------------------");

        RuntimeException exception = new RuntimeException();

       // throw exception;

        //throw new Person("Jimmy", 45, 'M'); object has have is a relationship with Throwable class


    }

}
