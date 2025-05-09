
  class Main{
        public static void main(String[] args) {
            Atm obj = new Atm();
            obj.setRupees(501);
            System.out.println(obj.getRupees());
        }
    }
class Atm{
    private int a;
    public void setRupees(int a){
        this.a=a;
    }
    public int getRupees(){
        return a;
    }
}