package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args)  throws InterruptedException {

        /*
        System.out.println("Program started");

        //System.out.println((100 / 0)); //unchecked exception - throws keyword not used for unchecked exceptions
       try {
           Thread.sleep(5000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
        System.out.println("Program ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program2 started");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program2 ended");

         */

        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("---------------------------------");

        System.out.println("Program2started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");

        System.out.println("---------------------------------");

        System.out.println("Program3 started");

        Thread.sleep(5000);

        System.out.println("Program3 ended");


    }

}
