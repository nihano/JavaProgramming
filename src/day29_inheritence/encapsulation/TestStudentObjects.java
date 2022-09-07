package day29_inheritence.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Hamza", 26, 'M', 'A', "MIT");
        System.out.println(student1);

        student1.setSchoolName("Harvard"); // because it is private we cannot directly call name of the obj we need to use setter method
        student1.setGrade('B');

        System.out.println(student1);














    }


}
