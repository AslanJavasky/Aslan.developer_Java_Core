package mod8_concurrency.lesson8_wait_and_notify;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class BankAccount {

    private volatile int balance;
    private boolean canWithdraw = true;


    public BankAccount(int initBalance) {
        this.balance = initBalance;
    }

    public void withdraw(int amount) {
        synchronized (this) {

            while (!canWithdraw || balance < amount) {

                try {
                    wait();// Wait until it's safe to withdraw
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " successfully withdrew " + amount + " galleons ");
            canWithdraw = false;
            notify();// Notify other threads that it's their turn
        }
    }

    public synchronized void allowWithdraw(){
        canWithdraw=true;
        notify();
    }


    public int getBalance() {
        return balance;
    }
}
