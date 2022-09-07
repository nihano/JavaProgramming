package day39_collections_completeClassesFromGitHub.multiThreading;

public class ThreadHelloWorld extends Thread {


    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello world "+i);
        }
    }
}
