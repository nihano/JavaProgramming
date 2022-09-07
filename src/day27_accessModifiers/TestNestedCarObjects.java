package day27_accessModifiers;

public class TestNestedCarObjects {

    public static void main(String[] args) {


        Car obj1 = new Car(); // Car object

        Car.CarEngine obj2 =  obj1.new CarEngine(); // CarEngine object. we created through the Car object. because inner class is not static.
        // we assigned the obj1 to new obj2 we called it through the outer class and CarEngine class


        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); // we created object through the class because inner class is static



    }

}
