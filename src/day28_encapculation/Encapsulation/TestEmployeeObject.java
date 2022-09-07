package day28_encapculation.Encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

        /*
        Employee employee1 = new Employee();
        // employee1.salary = -200000; we cannot set it directly because salary is private in Employee class
        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());

        employee1.setName("      ");
        System.out.println(employee1.getName());

         */

        Employee employee1 = new Employee("Khashayar", 30, "Java Developer", 100000);
        System.out.println(employee1);


    }

}
