package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor"); //constructor can take arguments. depends on the obj
    }

    {
        System.out.println("Instance Block"); // does not take arguments. depends on the obj.
    }

    static {
        System.out.println("Static Block"); // does not take arguments. cannot get executed more than once. does not depend on the obj.
    }


    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor(); // after creating the obj instance block gets executed first
        new StaticBlock_vs_InstanceBlock_vs_Constructor();
    }





}
