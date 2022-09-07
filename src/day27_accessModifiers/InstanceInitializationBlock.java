package day27_accessModifiers;

import java.security.PublicKey;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    {
        name = "James"; // we cannot pass parameters into instance block so every time when instance block get executed it will get executed for each object which means each obj will have the same name
        age = 20;
    }

    /*
    IT IS BETTER TO USE CONSTRUCTOR
    benefit of using constructor we can set the name and age to any data that we want
    public InstanceInitializationBlock(String name, int age){
        this.name = name;
        this.age = age;
    }

     */

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name); //James
        System.out.println(obj2.name); //James
    }




}
