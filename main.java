
class main{
   void main( int a, int b){
      System.out.println(a+b);
   }
   void main(int a, int b, int c){
      System.out.println(a+b+c);
   }
}
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


<<<<<<< HEAD
}
=======
       obj.main(5,10,15);
   }
}
>>>>>>> d5cced58d833f1732873639aa1c2e5d78c3a68f6
