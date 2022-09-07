package day33_abstraction;

import day27_accessModifiers.CydeoStudent;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {

    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1989, 11, 1), "A1", "Alumni Developer", 2);
        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();

    }

}
