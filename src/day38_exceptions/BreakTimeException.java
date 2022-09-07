package day38_exceptions;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){
        super("It's time for break");
    }

    public BreakTimeException(String message){
        super(message);
    }





}
