class Payment{
   int payment;

   void pay(int py)
   {
    payment = py;
   }
   void print()
   {
    System.out.println("Payment is : "+payment);
   }
}

class Class_Demo
{
    public static void main(String[] args) {

         Payment obj = new Payment();
         obj.pay(5000);
         obj.print();

         Payment obj1= new Payment();
         obj1.pay(11000);
         obj1.print();
        
    }
}

