package day31_inheritence.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();

        System.out.println("-----------------------");

        Circle circle = new Circle(3.5);
        System.out.println(circle);

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle(3, 2);
        System.out.println(rectangle);
        rectangle.draw();

        System.out.println("------------------------");
        Triangle triangle = new Triangle(2,3,4,3.5);
        System.out.println(rectangle);
        triangle.draw();



    }
}
