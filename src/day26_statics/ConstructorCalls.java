package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();//to call the constructor, it has to be first step in constructor body
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(2.5); // one constructor can only call one another constructor. it cannot call more than one constructor
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {
        method1();
        System.out.println("------------------------------");
        method2(); // we called method1 in method2 so it will execute method 1 first and then the print statement
    }

    public static void  method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }



}
