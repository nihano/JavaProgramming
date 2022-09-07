package utilities;

// import day27_accessModifiers.Data; // to import everything from Data class

// import static day27_accessModifiers.Data.d; // instead of importing everything we just import what we need. in this case we imported static member d
// import static day27_accessModifiers.Data.method3;
import static day27_accessModifiers.Data.*; // * is to import all the static members it is called wild import



public class Test2 {

    public static void main(String[] args) {

        System.out.println(d); // We can just call the variable itself without giving the class name explicitly. because we imported d. I commented out later because we imported every static members by using *
        method3();

        System.out.println(e);
        System.out.println(f);
        method4();

        /*
        CANNOT CALL BECAUSE WE DID NOT IMPORT INSTANCES
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();

         */


    }
}
