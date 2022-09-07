package day37_exceptions;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1==pizza2);// they are not the same objects
        System.out.println(pizza1.equals(pizza2)); // checking the values


        Object obj = new Pizza('S', 4, 3); //upcasting
        boolean r = obj.equals(pizza2); // true because we give condition in the equals method (size & #ofpepperonitoppings)
        System.out.println(r);


        Pizza pizza3 = ((Pizza)obj); //down casting
        double total  = pizza3.calcCost();
        System.out.println(total);
    }
}
