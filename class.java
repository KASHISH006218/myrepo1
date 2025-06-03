import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollN;
    int age;
    String name;
    public Student(int rollN, int age, String name) {
        this.rollN = rollN;
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return rollN + " " + age + " " + name;
    }
}

class sortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }}

class sortByrollN implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.rollN - s2.rollN;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(2, 32, "rahul"));
        list.add(new Student(4, 33, "kunal"));
        list.add(new Student(5, 31, "krish"));
        Collections.sort(list, new sortByName());
        System.out.println("Sorted by name:");
        for (Student s : list) {
            System.out.println(s);
        }
        Collections.sort(list, new sortByrollN());
        System.out.println("Sorted by roll number:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}