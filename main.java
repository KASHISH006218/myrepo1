

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
        System.out.println("x:payment done");

    }
}
class UpiPayment extends Payment{
    void pay(int a){
        System.out.println("payment done via Upi" + a);
    }
}
class CardPayment extends Payment{
    void pay(int a){
        System.out.println("CardPayment of" + a);
    }
}

