package day31_inheritence.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override // if after giving this it gives error it means method is not overriden
    public void eat(){
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hours in a day");
    }

    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching") ;
    }



}
