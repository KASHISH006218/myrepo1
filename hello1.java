class Hello1 {
    int balance = 1000;

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal of " + amount);
        }
    }

    public static void main(String[] args) {
        Hello1 account = new Hello1();

        Thread A = new Thread(() -> {
            account.withdraw(800);
        });

        Thread B = new Thread(() -> {
            account.withdraw(500);
        });

        A.start();
        B.start();

        try {A.join();
            B.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}