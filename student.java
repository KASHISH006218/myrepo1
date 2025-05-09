
class main{
    public static void main(String[] args) {
        student Obj = new student();
        Obj.setName("kashish");
        Obj.setMarks(95);
        Obj.printDetails();

    }
}
public class student{ 
     private String name;
    private int marks;

    public void setName(String name) {
       this.name = name;
}
public void setMarks(int marks) {

    this.marks = marks;

}
public String getName(){
    return name;
}
public int getmarks(){
    return marks;

}
public void printDetails(){
    System.out.println("Name:" + name + "Marks:" +marks);
}
}

