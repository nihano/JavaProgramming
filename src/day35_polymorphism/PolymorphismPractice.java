package day35_polymorphism;


import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        tiger.eat(); // overridden version in Tiger will get executed.
        tiger.drink();
        tiger.sleep();
        //tiger.hunt(); it is not in the reference type Animal. We cannot call it.


        Animal animal = new Eagle("Jonh", "American Eagle", 'M', 3, "Small", "Black & White");
        //animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        //obj1.eat();
        //obj1.drink();
        //obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog =null;
        Cat cat = null;
        CydeoCar cydeoCar= null;
        Flyable[] birds = {parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck, cydeoCar};

        Playable[] friendlyAnimals = {parrot, dolphin, duck, cat};

        // boolean isAnimal = cydeoCar instanceof Animal; //to see if cydeoCar is Animal or not.
        boolean isAnimal = dog instanceof Animal;

        System.out.println("isAnimal = " + isAnimal);

        System.out.println("----------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi =  car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);


    }
}
