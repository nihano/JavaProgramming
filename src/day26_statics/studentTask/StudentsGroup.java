package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentsGroup HAS a Student

    public String groupName;
    public int groupId;
    public ArrayList<Student> students; // we want to store customized students objects into arraylist so the data type is Student
    //we gave the reference variable of this arraylist, but we did not create the arraylist object.
    //every StudentsGroup object they should also have arraylist object. two ways to do it
    /*
    first way directly initialize the arraylist obj to the reference variable
    meaning if we create 10 obj of this class there will be copies of this instance variable as well
    public ArrayList<Student> students = new ArrayList<>();
     */

    //second way, when we generate the constructor


    //here we did not select arraylist variable because everytime when we create the object we need to pass the arraylist as an argument
    public StudentsGroup(String groupName, int groupId) { //creates the StudentGroup obj by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>(); //size: 0
        //after creating obj if no students arraylist will be given, we want to make sure the student arraylist size is set to 0 at the beginning
        //so, we instantiated in the constructor, because if we do not have the arraylist obj we cannot use the arraylist methods later. we cannot stor multiple students etc.
        //we will add students elements later on, size is 0 now
    }


    public void addStudent(Student student){ // argument is Student object. takes one student obj, and adds it to the arraylist of students
        students.add(student); // students: arraylist, student: argument
    }

    public void addStudent(Student[] students){ // adding one array of students to arraylist of students
        this.students.addAll(Arrays.asList(students));//arraylist's instance variable name and methods parameter name same (students) so we used this keyword
    }



    //takes name, age, gender, id of the student info, creates the student obj by using the given info, then adds the student obj to the arraylist of student
    public void addStudent(String name, int age, char gender, String id){ // another way we overloaded the addStudent method
        //Student student =  new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, id)); // we directly passed the student object into students
    }

    //takes the id and then removes the student obj with the specified if from arraylist of students
    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));    //if the students id is the given id then it should be removed
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() + // we modified it, we only want to display # of students
                '}';
    }
}

/*
2. Create a custom class named StudentsGroup
            Attributes:
                groupName
                groupId
                students (ArrayList<Students>)

            Add a constructor that can set the groupId and groupName
                    initialize students arraylist in the constrcutor's body

            Methods:
                addStudent(Student): adds the specified student to the students arrayList
                removeStudent(id): removes the student with the specified id from the students arraylist
                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */