package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){ // constructor
        System.out.println("Constructor"); // it gets executed 3 times, 3 obj created. however main method and static block get executed one time. they don't not depend on the obj
    }

    public static void main(String[] args) {
        System.out.println("Main Method"); // after all the static blocks gets executed, main method will get executed

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }


    static{
        System.out.println("Static BLock"); // first gets executed. it only gets executed one time
    }


}
