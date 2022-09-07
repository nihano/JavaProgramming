package day27_accessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        /*
        DO NOT CALL STATIC MEMBERS THROUGH THE OBJ IT WON'T GIVE ERROR BUT IT IS NOT THE RIGHT WAY
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
         */

        System.out.println(Circle.pi); //CORRECT WAY THROUGH THE CLASS NAME
        //System.out.println(Circle.radius); WRONG. WE CANNOT CALL THE INSTANCE VARIABLES THROUGH THE CLASS NAME. WE CAN CALL IT THROUGH THE OBJ





    }

}
