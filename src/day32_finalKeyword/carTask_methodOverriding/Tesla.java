package day32_finalKeyword.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car{

    public Tesla( String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getMake()+ " " +getModel()+ " is in self driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " +getMake() + " " + getModel());
    }


    @Override
    public void setModel(String model) {
        String[] models = {"Model S", "Model Y", "Model x", "Model 3" }; // muhtar changed it to ArrayList but I kept it to show different option

        if (!Arrays.asList(models).contains(model)){ // we converted array to collection type by using asList method to use contains method
            System.err.println("Invalid Tesla model: " + model);
            System.exit(1);
        }
        super.setModel(model); // we called the setModel code from parent class which has this.model=model code fragment. Because parent class setModel can access the instance variables such as model
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));
        if(!colors.contains(color)){
            System.out.println("Invalid Tesla color: "+ color);
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year<2008){
            System.out.println("Invalid year of Tesla car: " + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price<50000){
            System.err.println(("Invalid price for Tesla car: " + price));
            System.exit(1);
        }
        super.setPrice(price); // if we do not use the super keyword it will call the current classes setPrice method. super. keyword is calling the method from Parent class
    }
}

/*
 5. Tesla
               		start(): "Say \"Start\""
	                Extra method:
	                	  autoPilot()
	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */
