package day31_inheritence.shape_methodOverriding;

public class Square extends Shape{ // constructor called by default

    private double side;

    public Square(double side) { // default is called in here we don't see it
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area(){
        return side*side;
    }

    @Override
    public double perimeter(){
        return 4*side;
    }

    @Override
    public void draw(){
        System.out.println("Drawing square");
        System.out.println("\t* * * * * *");
        for (int i=0 ; i<4; i++){
            System.out.println("\t*         *");

        }
        System.out.println("\t* * * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' + ", " +
                "side='" + side + '\'' + ", " +
                "area='" + area()+ '\'' + ", " +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
