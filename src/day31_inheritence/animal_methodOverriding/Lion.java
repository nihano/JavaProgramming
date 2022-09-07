package day31_inheritence.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color); // calling the parent class constructor
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat(){
        System.out.println("Lion "+getName() + " is eating deer");
    }

    public void roar(){
        System.out.println("Lion "+getName() + " is eating roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", " ") + // to replace the '}' at the end with empty string because in parent class toString method there is } at the end and we already have it after is AfricanLion
                ", African lion='" + isAfricanLion+ '\'' +
                '}';
    }
}
