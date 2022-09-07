package day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {


        ArrayList<Pizza> pizzas = new ArrayList<>();

        // OutOfMemoryError --> not enough space in heap because of infinite loop
        // Errors are irrecoverable
        /*
        while(true){
            pizzas.add(  new Pizza('S', 2, 3) );
        }
         */

    }

}





