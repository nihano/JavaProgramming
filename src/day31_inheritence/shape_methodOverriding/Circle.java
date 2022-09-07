package day31_inheritence.shape_methodOverriding;

public final class Circle extends Shape {

    private double radius;

    public Circle(double radius) { // default constructor will be called from parant class
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }

    @Override
    public void draw() {
        super.draw();
        //code fragments that can draw a circle

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' + ", " +
                "radius='" + radius + '\'' + ", " +
                "area='" + area()+ '\'' + ", " +
                "perimeter='" + perimeter() + '\'' +

                '}';
    }
}
