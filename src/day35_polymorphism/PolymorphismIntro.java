package day35_polymorphism;

import day31_inheritence.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

      Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

      Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

      Tiger tiger = null;

      Eagle eagle = null;

      Lion lion = null;

      Parrot parrot = null;

      Dolphin dolphin = null;

      Shark shark = null;

      Duck duck = null;

        //We will store dog and cat objects in one variable, a data structure array
        //Dog class does not have these objects, so it cannot reference to them that's why it gives error when we want to store them in Dog

        //Dog[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck};

        //All these objects have is a relationship with animal

        Animal[] animals = {dog, cat, tiger, eagle, lion, parrot, dolphin, shark, duck};

        Animal animal_1 = dolphin;

        //Animal animal1 = new Tesla("Model Y", "blue", 2022, 60000);
                // there is no "is a relationship" between animal and tesla
      Animal animal =new Dog("Max", "Husky", 'M', 4, "Small", "White");

      animal.eat();
      animal.drink();
      animal.sleep();

      //animal.play();
      //animal.bark(); --> bark method is in dog class. it does not exist in the reference type, so we cannot call methods outside from the reference type(in this case parent class Animal)

      System.out.println("-------------------------------------------");

      String str = "Java"; // string obj

      Integer n = 100; // wrapper class obj

      Boolean r = false; // wrapper class obj

      Double d = 10.5; // wrapper class obj

      Circle circle = new Circle(4); // custom obj

      Honda honda = new Honda("Pilot", "Black", 2019, 35000);

      Audi audi = new Audi("Q6", "Silver", 2020, 36000);

      Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

      Teacher teacher = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

      Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

      Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

      Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

      //OBJECT CLASS is the parent class of all the classes in Java

      Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};

      System.out.println(Arrays.toString(objects));

      Employee[] employees = {teacher, developer, driver, teacher};

      Employee obj = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
      obj.work(); // overridden version of work method in Developer class will get executed. if there is no overriden method, employee class method will get executing

      System.out.println("------------------------------------------");



    }
}
