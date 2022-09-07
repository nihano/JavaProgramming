package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println((9 / 0));
        }catch(RuntimeException e){
            System.out.println("RuntimeException has been caught");
            e.printStackTrace();
        }finally {
            System.out.println("Finally block"); //it  will always be executed even if exception handled or not
        }


        //if we forcefully stop the program via System.exit(1); before finally block it will not be executed




    }


}
