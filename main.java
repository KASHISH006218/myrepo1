
class Parent{
   void main( int a, int b){
      System.out.println(a+b);
   }
   void main(int a, int b, int c){
      System.out.println(a+b+c);
   }
}
class main{
   public static void main(String[] args) {
       Parent obj = new Parent();
       obj.main(5, 10);

       obj.main(5,10,15);
   }
}
