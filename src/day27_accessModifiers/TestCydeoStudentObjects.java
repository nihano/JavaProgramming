package day27_accessModifiers;

public class TestCydeoStudentObjects {

    /*
    static ==> does not depend on the object, and no object need to be created to access statics
    instance ==> depends on the object. there MUST be an object to use the instances in other class.
    And every time when an object created, a different memory will be allocated to that object,
    so it's better to use  static (single copy) variables &methods,
    if there is no need for the instance (multiple copy) variables & methods
     */

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Ekaterina", 29, 'F');
        CydeoStudent student2 = new CydeoStudent("Alena", 28, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName); // it is not preferred to call the static members through the object that's why it does not give shortcut
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);



    }

}

