package day34_abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static & final by default. you need to initialize the final value. we do not have constructor in interface
    // variables are public by default in interface

    /*

    public static void main(String[] args) { // we can have also private access modifier for static methods
        System.out.println(isFriendly); // we can call static variable in static method

        //isFriendly=false; final we cannot change it
    }

    //public void method(){} we cannot give instance methods


    //default method transforms into instance method in sub classes
    default void method1(){// we can give default methods, access modifier is public by default as well.

    }

     */

    public abstract void play(); // interface has to have abstract method but public and abstract keyword are given by default



}
