package day31_inheritence.shape_methodOverriding;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double base;
    private double height;


    public Triangle(double side1, double side2, double base, double height) {
        setSide1(side1);
        setSide2(side2);
        setBase(base);
        setHeight(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return base*height*0.5;
    }

    @Override
    public double perimeter() {
        return side1+side2+base;
    }

    public void draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' + ", " +
                "side1='" + side1 + '\'' + ", " +
                "side2='" + side2 + '\'' + ", " +
                "base='" + base + '\'' + ", " +
                "height='" + height + '\'' + ", " +
                "area='" + area()+ '\'' + ", " +
                "perimeter='" + perimeter() + '\'' +

                '}';
    }
}
