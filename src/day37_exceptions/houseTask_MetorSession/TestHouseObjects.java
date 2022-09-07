package day37_exceptions.houseTask_MetorSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHouseObjects {

    public static void main(String[] args) {

        ArrayList<House> houses = new ArrayList<>(Arrays.asList(
                new SquareHouse("SquareHouse-1",20 ),
                new SquareHouse("SquareHouse-2",25 ),
                new SquareHouse("SquareHouse-3",30 ),

                new RectangleHouse("RectangleHouse-1", 30,20),
                new RectangleHouse("RectangleHouse-2", 20,25),

                new CircleHouse("CircleHouse-1", 15),
                new CircleHouse("CircleHouse-2", 20),
                new CircleHouse("CircleHouse-3", 10)));


        List<House> housesForCustomer = new ArrayList<>();
        for (House each : houses) {
            if(each.areaOfHouse()>600){
                housesForCustomer.add(each);
            }
        }

        System.out.println(housesForCustomer);


    }
}
