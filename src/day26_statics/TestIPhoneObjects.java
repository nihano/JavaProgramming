package day26_statics;

public class TestIPhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone =new IPhone("iPhone 12", "Black", 1000);
        System.out.println(iPhone.color);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo(); // we can also access printPhoneInfo method through the object because it is instance

        /*
        IT IS NOT THE LEGAL WAY TO CALL STATIC VARIABLES AND METHODS THROUGH THE OBJECT EVEN THOUGH IT DOES NOT GIVE ERROR
        System.out.println(iPhone.brand); // brand is static, but it is in the class and objects can share all the class members
        System.out.println(iPhone.OS); // static as well, we called through the object
        iPhone.printOS();// static method we called through the object
         */

        //CORRECT WAY TO CALL ANYTHING STATIC IS TO CALL THROUGH THE CLASS NAME

        //CLASS NAME: IPhone , OBJECT NAME: iPhone
        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOS();


    }



}
