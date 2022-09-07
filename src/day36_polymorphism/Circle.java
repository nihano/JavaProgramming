package day36_polymorphism;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",area=" + area() +
                ",perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            System.err.println("Invalid Object"); // if the specified object is not circle, then we should not compare them
            System.exit(1);
        }

        if (radius == ((Circle) obj).radius){ // if the current circles' radius is equal to given circle's radius, then two circles are equal. because reference type of obj is Object we casted it to Circle
            return true;
        }
        return false;
    }
}

