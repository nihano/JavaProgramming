package day31_inheritence.shape_methodOverriding;

public class Shape {

    private String name;
    
    public Shape(){ // default constructor we dont need to call in subclass
        setName(getClass().getSimpleName()); // we do not need to pass aditional parameter set the name every class has the name as a class name so we just passed Class name in setName method
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0; // default value in the child classes we can change it
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' + ", " +
                "area='" + area()+ '\'' + ", " +
                "perimeter='" + perimeter() + '\'' +

                '}';
    }
}
