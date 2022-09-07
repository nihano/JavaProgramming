package day28_encapculation.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        // student.age = -200; we cannot get the age through the object because the age is private



        student.setAge(25);
        System.out.println(student.getAge()); // we created getAge method in the Person class


        student.setName("Aaron123");
        System.out.println(student.getName());





    }
}
