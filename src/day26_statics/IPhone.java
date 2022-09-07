package day26_statics;

public class IPhone {

    public static String brand = "Apple"; // static: Apple for all
    public String model; // instance: different model for iphone objects. We initialize instance variables in the constructor because constructor gets executed separately for each object
    public String color;
    public double price;
    public static String OS = "iOS"; // static: same operating system
    public static String madeIn = "China"; // static: chine for all
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    //TO INITIALIZE THE INSTANCE VARIABLES
    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
    GIVES ERROR BECAUSE WE USED INSTANCE VARIABLES IN STATIC METHOD
    METHOD SHOULD BE INSTANCE IN THAT CASE
    STATIC METHOD ONLY ACCEPT STATIC VARIABLES
    public static void printPhoneInfo(){
        System.out.println("Model:" + model);
        System.out.println("Color:" + color);
    }
     */

    //instance methods are object members. objects can share what the class has
    // so object can share static methods in that class
    public void printPhoneInfo(){
        System.out.println("Color: "+color);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Brand: "+brand); // brand is static variable

    }

    //if we have static method we do not need to create the object
    //if we do not need instance variables in the method we can use static method
    public static void printOS(){ //static method
        System.out.println("OS: "+OS); // static variable
    }




}
/*
Attributes
    brand, model, color, price, operating system, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */
