package day37_exceptions.houseTask_MetorSession;

public class CircleHouse extends House{

    double radius;

    public CircleHouse(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double areaOfHouse() {
        return radius*radius*Math.PI;
    }


}
