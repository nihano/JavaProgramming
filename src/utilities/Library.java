package utilities;

public class Library {

    public static void sleep(double seconds) {
        try {
            Thread.sleep( (long)(seconds * 1000L) ); // to convert miliseconds to seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
