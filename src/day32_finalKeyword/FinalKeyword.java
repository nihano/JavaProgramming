package day32_finalKeyword;

import java.time.LocalDate;


class Student{

    public final void language(){
        System.out.println("Java Programming");
    }



}

public final class FinalKeyword extends Student {

    /*
    public void  language(){ // final methods can never be overridden
        System.out.println("Python Programming");
    }
     */

    public FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender = 'M'; // local variable in main method

        System.out.println(gender); // M

        // gender = 'F'; compile error

        System.out.println(gender); // F

        System.out.println("----------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1); compile error
        System.out.println(dateOfBirth); //added  1 year

        System.out.println("----------------------------");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("----------------------------");

        final String name = "James"; // if you use final keyword it will never be eligible for garbage collection
        // name = null; // unreferencing, James eligible for garbage collection (before using final)
        //name = "Daniel"; // James again eligible   for garbage collection (before using final)
        System.out.println(name);


    }
}
