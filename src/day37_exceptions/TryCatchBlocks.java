package day37_exceptions;

import java.util.Locale;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            System.out.println(9/0); // code will cause ArithmeticException
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
        }


        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try BLock");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }


        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(5000); //checked exception
            System.out.println("Try Block");
        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }
        
        System.out.println("Program4 ended");


    }

}
