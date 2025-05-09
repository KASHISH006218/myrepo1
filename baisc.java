class Atm{
    private int a;
    public void setRupees(int a){
        this.a=a;
    }
    public int getRupees(){
        return a;
    }
    class Main{
        public static void main(String[] args) {
            Atm obj = new Atm();
            obj.setRupees(a:501);
            System.out.println(obj.getRupees());
        }
    }
}