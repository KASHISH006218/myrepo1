// 
// 


 class MyRunnable implements Runnable {
     public void run() {
         System.out.println("Hello from MyRunnable!");
     }
 }
 public class Hello {
     public static void main(String[] args) {
         MyRunnable myRunnable = new MyRunnable();
         Thread t1 = new Thread(myRunnable);
         t1.start();
         try {
                t1.join(); // Wait for the thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
             
         } 
         for (int i = 0; i < 5; i++) {
                System.out.println(i);
         }
                                 }
             System.out.println("Main thread is running: " + (i + 1));
         }
         

