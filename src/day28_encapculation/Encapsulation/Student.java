package day28_encapculation.Encapsulation;

public class Student {

    private String name;

    public String getName() {
        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }

            if (hasDigit){
                System.err.println("Invalid name: " + name);
                System.exit(1);
            }

        this.name = name;
    }

    private int age;

    public int getAge(){ //READ ONLY
        if (age == 0){
            System.err.println("Age has not been set");
            System.exit(1); // status code 1
        }
        return age;
    }

    public void setAge(int age){ //WRITE ONLY
        if ( age < 1 || age > 100 ){
            System.err.println("Invalid Age: " +age); // we can give a condition in setter.
            // return; // exiting the method
            System.exit(1); // exiting the entire program, remaining code fragments will not be executed
        }


        this.age = age;
    }


}
