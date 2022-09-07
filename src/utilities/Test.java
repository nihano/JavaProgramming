package utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data; // REGULAR IMPORT STATEMENT. we imported Data class from day27 package

public class Test {

    public static void main(String[] args) {
        System.out.println(Data.d); // because we import everything we can use all the methods variables through the class name in Test class
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data(); //also we can create an obj from this class to use instance variables and method

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("-------------------------------");

        //TESTING ACCESS MODIFIERS
        System.out.println(AccessModifiers.publicData); //testing access public modifier. in different package public is accessible
        //System.out.println(AccessModifiers.protectedData); protected is not always accessible in different packages unless we create subclass (we'll learn later)
        // System.out.println(AccessModifiers.defaultData); // is not accessible in different packages
        //System.out.println(AccessModifiers.privateData); //only accessible in the same class of same package

        new AccessModifiers(); // because access modifier of the constructor is public we can create the obj in different package

        AccessModifiers.publicMethod();  // only public is accessible
        //AccessModifiers.protectedMethod(); // in some cases it is accessible we'll learn later


    }
}
