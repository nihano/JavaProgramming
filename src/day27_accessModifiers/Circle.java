package day27_accessModifiers;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2; // this keyword is not necessary because we do not have diameter as argument in the parenthesis (local variable)
    }

    /*
    public static double calcArea(){ //static method only accepts statics
        return radius * radius * pi;//we cannot use radius in static method
    }
     */

    public double calcArea(){
       return radius * radius   * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }

    public static void printPiValue(){
        System.out.println("Pi values is: " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */