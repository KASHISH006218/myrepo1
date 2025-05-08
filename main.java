

class main{
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
         obj.pay(5000);
         obj.print();

         Payment obj1= new CardPayment();
         obj1.pay(11000);
         obj1.print();
    }
}

    
    
    
abstract class Payment{
    abstract void pay(int a);
void print(){
         

// package java;

// import java.util.regex.Pattern;

// public class Main{
//     public static void main(String[] args) {
//         pattern obj= new pattern();
//         obj.sayhello();
//         System.out.println(obj.name);
//     }


}