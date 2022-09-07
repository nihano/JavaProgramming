package day30_inheritence.phoneTask;


public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone 12", "Large", "Black", 1000.5);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(12345678);
        samsung.text(12345678);
        nokia.text(12345678);

        System.out.println("------------------------------------");

        iphone.faceTime(122372148);
        samsung.freeze();
        nokia.selfDefence();

        System.out.println("-------------------------------------");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }
}
