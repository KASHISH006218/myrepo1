 class Mythread extends Thread {
    public void run() {
        System.out.println("hello");
    }
}
class Multithread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        System.out.println("hiii");
    }
}