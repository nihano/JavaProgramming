package day29_inheritence.animalTask;

public class Dog extends Animal{ // dog is an animal
    //       child       parent

    /*
    public void method(){
        System.out.println(name); // these instance variables we declared in Animal class
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        drink();
        eat();
        sleep();
        toString();

    }
     */

    public void bark() {
        System.out.println(getName() + " is barking");
    }




}

/*
7 variables inherited from animal class
5 methods inherited
we do not need to declare those in Dog class because they are inherited from parent class Animal
 */
