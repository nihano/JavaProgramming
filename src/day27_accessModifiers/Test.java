package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a); // class is in the same package, so we did not need the import statmenet
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("----------------------------------");

        System.out.println(AccessModifiers.publicData); // testing public access modifier . in same package it is accessible
        System.out.println(AccessModifiers.protectedData); // testing protected access modifier. in same package it is accessible
        System.out.println(AccessModifiers.defaultData); //accessible in different class of same package
        //System.out.println(AccessModifiers.privateData); // not accessible in different class only accessible within the same class


        new AccessModifiers(); // because we set constructor as public we can create obj in different class

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod(); //it is not accessible in different class
    }
}
