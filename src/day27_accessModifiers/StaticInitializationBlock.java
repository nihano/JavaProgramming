package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    // public static ExcelSheet sheet; // may take more than steps to set the value, so we need static block for these we will learn in the future

    static {

        a = 100;
        b = 20.5;
        c = "Java";

    }

    /*
    WE DON'T USE CONSTRUCTOR TO SET THE STATIC VARIABLES BECAUSE WE NEED TO CREATE THE OBJ
    USING STATIC BLOCK IS PREFERRED
    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
     */



}

