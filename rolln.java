
class rollN{
import java.util.ArrayList;
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
        list.add(new Student(55, "rahul"));
        list.add(new Student(67, "kunal"));
        list.add(new Student(78, "krish"));
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
}