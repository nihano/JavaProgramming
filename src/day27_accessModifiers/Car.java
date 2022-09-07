package day27_accessModifiers;

public class Car { //Outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // Inner class. it can access every member of outer class. In order to use this class object, first we need to have Car objects
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass{ // it only accepts static members of outer class
        public void method(){
           // System.out.println(make); // static only accepts static member. make is instance.
            System.out.println(wheels);
        }
    }


}
