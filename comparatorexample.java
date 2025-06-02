
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }

    public int compareTo(Student s) {
        return this.age - s.age; // Compare by age
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(12, "rahul"));
        list.add(new Student(16, "kunal"));
        list.add(new Student(18, "krish"));
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}