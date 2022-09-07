package day31_inheritence;

class A{

    public int a = 100;


}

public class FieldHiding extends A {

    public int a = 300;  // this variable will not be inherited

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);
    }
}
