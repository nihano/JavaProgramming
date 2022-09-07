package day30_inheritence.phoneTask;

public class IPhone extends Phone{ //IPhone is a Phone

    public static boolean hasApplePay = true;

    //Creating a constructor
    public IPhone(String model, String size, String color, double price) { // we deleted brand here
        super("Apple", model, size, color, price); // brand is same for all the IPhones so we gave "Apple" for all
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is facetiming  with "+phoneNumber);

    }

    public void faceTime(String email){
        System.out.println(getModel() + " is facetiming  with "+email);
    }


}

/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */
