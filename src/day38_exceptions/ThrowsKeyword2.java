package day38_exceptions;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.SortedMap;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        method1(); // we used throws keyword in both methods but still we have checked exception here
        //we will not call the main method most of the time in anywhere, so we can use throws keyword here
        Library.sleep(3.5);

    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds(); // we used throws keyword in the method exception ignored by compiler but not handled, so we have the exception here, so you can still use the throws keyword here
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);


    }





}
