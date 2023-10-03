package mod8_concurrency.lesson9_atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class BankAccount {

    private AtomicInteger balance;

    public BankAccount(int initBalance) {
        this.balance = new AtomicInteger(initBalance);
    }

    public void withdraw(int amount) {

        int currentBalance = balance.get();
        if (currentBalance >= amount) {
            int newBalance = currentBalance - amount;
            if (balance.compareAndSet(currentBalance,newBalance)){
                System.out.println(Thread.currentThread().getName() + " successfully withdrew " + amount + " galleons ");
            }else {
                System.out.println(Thread.currentThread().getName() + " withdrawal failed due to concurrent update.");
             }

        }else {
            System.out.println(Thread.currentThread().getName() + " couldn't withdraw " + amount + " galleons. Insufficient funds!");

        }
    }

    public int getBalance() {
        return balance.get();
    }
}
