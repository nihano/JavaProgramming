package day29_inheritence.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");


        Cat cat = new Cat();
        cat.setInfo("Felicia", "Stray", 'F', 3, "Medium", "Black and White");


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 5,"Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("----------------------------------");
        dog.eat();
        dog.drink();
        dog.sleep();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println("------------------------------------");

        dog.bark();
        cat.meow();
        tiger.hunt();

        System.out.println("------------------------------------");


        /*

        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K'; // when variables are public in animal class no restrictions
        dog.age = -100;
         */

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);







    }


}
