
import java.awt.Rectangle;

public class Main{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

       rect.setLength(10.0);
        rect.setwidth(5.0);

        system.out.println("Area:" + rect.setArea());
        system.out.println("perimeter: " +rect.getPerimeter());
 
}
}
public class Rectangle {

private double length;
private double width;
public void setLength(double length){
    this.length = length;

}
public void setWidth(double width){
    this.width = width;

}
public double getArea(){
    return length * width;
    public double getperimeter(){
        return 2( length + width)
    }
}
}