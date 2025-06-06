Student Class{
// Student Class
// This class represents a student with attributes like ID, name, age, and grade.
// It includes methods to get student details and a toString method for easy display.

    
}
class Student {
    String id;
    String name;
    int age;
    String grade;

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters for student attributes
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

// Student Management Class
import java.util.*;
import java.util.ArrayList;
import java.util.List;

class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayAllStudents(){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public Student searchStudent(String id){
        for(Student student : students){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String id){
        students.removeIf(student -> student.getId().equals(id));
    }

    private static class ArrayList {

        public ArrayList() {
        }
    }
