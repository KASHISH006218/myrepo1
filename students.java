class Students implements Comparable<Students> {
    int rollNo;
    String name;
    int age;

    public Students(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Students other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Age: " + age;
    }
}

public class students {
    // This class demonstrates the use of the Students class and its comparison functionality.
    public static void main(String[] args) {
        Students s1 = new Students(1, "kashish", 20);
        Students s2 = new Students(2, "kunal", 22);
        Students s3 = new Students(3, "shravi", 21);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Students[] students = {s1, s2, s3};
         System.out.println("Comparing s1 and s2: " + s1.compareTo(s2));
    }
}