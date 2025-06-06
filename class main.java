 interface MyInterface{
     void show();
 }

 public class  Main{

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
             @Override
             public void show() {
                 System.out.println("Hello, this is an anonymous class implementing MyInterface.");
             }
         };
        
         myInterface.show();
     }
 }
