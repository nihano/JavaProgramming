package day36_polymorphism;

import day29_inheritence.animalTask.Animal;
import day29_inheritence.animalTask.Cat;
import day29_inheritence.animalTask.Dog;
import day30_inheritence.phoneTask.IPhone;
import day30_inheritence.phoneTask.Nokia;
import day30_inheritence.phoneTask.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Employee;
import day33_abstraction.employeeTask.Tester;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;
import utilities.Test;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        //Dog dog  = new Dog();

        //Cat cat = new Dog();


        Animal animal = new Dog(); //Polymorphism: parent is referencing to the child ==> UPCASTING implicitly converts the Dog object to the Animal reference type

        System.out.println("-----------------------------------------");

        Animal animal1 = new Dog(); // upcasting ==> polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");


        animal1.eat(); // method in animal class
        animal1.drink(); // method in animal class
        animal1.sleep();// method in animal class
        //animal1.bark(); // bark() method is not in animal class we cannot call it


        ((Dog) animal1).bark(); // DOWNCASTING, we casted animal1 to the Dog so we can use bark() method of Dog class

        /*
        Dog dog1 = (Dog) animal1; // if we want to use it more than once we can assign it to dog1
        dog1.bark();
        // no new dog object created it is still same obj
         */

        /*
        ((Cat)animal1).scratch(); //
        animal1 is referencing Dog obj so ClassCastException will be thrown.
        There is no "IS A relationship" between animal1 and Cat
        Dog cannot be converted to Cat
         */

        System.out.println("-----------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Pink", 350);
        phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefence();
        //((IPhone) phone).faceTime(123456); //Nokia cannot be converted to IPhone because there is no "is a relationship" between Nokia and IPhone

        System.out.println("------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());

        // Tester tester = (Tester)employee; //employee's object is Developer. Developer has no "is a relationship" with Tester. ClassCastException


        System.out.println("---------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);
        electric.charge();
        ((Tesla) electric).selfDrive();
        ((AutoPilot) electric).selfDrive();

        System.out.println("---------------------------------");



    }

}
