package day35_polymorphism.transportationTask;

public class Tesla extends Car implements AutoPilot, Electric{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }


    @Override
    public void AutoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }
}
