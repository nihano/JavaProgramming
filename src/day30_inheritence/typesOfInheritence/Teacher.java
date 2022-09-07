package day30_inheritence.typesOfInheritence;

import java.time.LocalDate;

public class Teacher extends Employee{ // employee class also subclass of Person so multilevel inheritence


    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB, jobTitle, employeeId, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }
}
