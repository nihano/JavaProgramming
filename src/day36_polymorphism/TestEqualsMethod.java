package day36_polymorphism;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false, they are not the same objects

        System.out.println(circle1.equals(circle2)); // true, overridden method in Circle class. equals method compares values
        System.out.println(circle1.equals(circle3)); // false

        System.out.println("-----------------------------------");

        IPhone iPhone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iPhone2 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        System.out.println(iPhone1.equals(iPhone2));

    }





}
