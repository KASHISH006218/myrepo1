
import java.util.function.ObjDoubleConsumer;

class main{
    public static void main(String[] args) {
        Payment obj = new UpiPayment
         obj.pay(a:5000);;
         obj.print();
         Payment obj= new CardPayment();
         obj1.pay(a:11000);
         obj1.print();
         

    
    
    
abstract class Payment{
    abstract void pay(int a);
    void print(){
        System.out.println("x:payment done");

    }
}
class UpiPayment extends Payment{
    void pay(int a){
        System.out.println("payment done via Upi" + a);
    }
}
}
//     public static void main(String[] args) {
//         int[ ]arr = { 7,2,10,5,8};
//         int max = arr[0];
//         int min = arr[0];
//         for (int i =0; i <arr.length; i++){
//             if(arr[i]>max){
//                 max = arr[i];

//             }
//             if(arr[i] < min){

//             }
//         }
//         System.out.println("max is " + max);
//         System.out.println("min is " + min);
//     }

// }