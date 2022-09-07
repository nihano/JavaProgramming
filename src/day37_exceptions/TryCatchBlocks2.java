package day37_exceptions;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
           // e.printStackTrace(); // display the full detail of the exception after the execution of the program
            System.out.println(e.getMessage());// just gives the exception message
        }


        System.out.println("Program ended");

        System.out.println("-----------------------------------");

        System.out.println("Program2 started");

        try{
            System.out.println(9 / 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Program2 ended");
    }
}

