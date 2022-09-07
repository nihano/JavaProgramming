package day28_encapculation.Encapsulation;

public class Employee {

    private String name;

    private int age;
    //public double salary; // we cannot give condition if the data is public

    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name); // instead of this keyword we used setter method because we gave conditions in setter body. this keyword directly passes the given argument without checking any condition
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16){
            System.err.println("Invalid age: " +age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
         if ( jobTitle.isBlank() || jobTitle.isBlank()){
             System.err.println("Job title of the employee cannot be empty or blank");
             System.exit(1);
         }
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if (name == null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name cannot be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() { //READ
        return salary;
    }

    public void setSalary(double salary) { //WRITE

        if ( salary < 0 ){
            System.err.println("Salary cannot be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
