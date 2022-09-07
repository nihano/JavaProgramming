package day31_inheritence.shape_methodOverriding;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter(){
        return 2*(width+length);
    }

    public void draw(){
        System.out.println("* * * * * * *");
        for(int i=0; i<2; i++){
            System.out.println("*           *");
        }
        System.out.println("* * * * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' + ", " +
                "width='" +  getWidth()+ '\'' + ", " +
                "length='" + getWidth() + '\'' + ", " +
                "area='" + area()+ '\'' + ", " +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
