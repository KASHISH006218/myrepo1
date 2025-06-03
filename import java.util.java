import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollN;
    String name;

    public Student(int rollN, String name) {
        this.rollN = rollN;
        this.name = name;
    }

    
    public String toString() {
        return rollN + " " + name;
    }

    
    public int compareTo(Student s) {
        return this.rollN - s.rollN; // Compare by roll number
    }
}

class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(rollN: 55, name "rahul",age:12));
        list.add(new Student(rollN:67,name "kunal",age:16));
        list.add(new Student(rollN:78, name"krish",age:18));
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}