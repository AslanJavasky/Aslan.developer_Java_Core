package mod8_concurrency.lesson7_volatile;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class BankAccount {

    private volatile int balance;

    public BankAccount(int initBalance) {
        this.balance = initBalance;
    }

    //    public synchronized void withdraw(int amount) {
//        int newBalance = balance - amount;
//        if (newBalance >= 0) {
//            balance = newBalance;
//            System.out.println(Thread.currentThread().getName() + " successfully withdrew " + amount + " galleons ");
//        } else {
//            System.out.println(Thread.currentThread().getName() + " couldn't withdraw " + amount + " galleons. Insufficient funds!");
//        }
//    }
    public void withdraw(int amount) {
        synchronized (this) {
            int newBalance = balance - amount;
            if (newBalance >= 0) {
                balance = newBalance;
                System.out.println(Thread.currentThread().getName() + " successfully withdrew " + amount + " galleons ");
            } else {
                System.out.println(Thread.currentThread().getName() + " couldn't withdraw " + amount + " galleons. Insufficient funds!");
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}
