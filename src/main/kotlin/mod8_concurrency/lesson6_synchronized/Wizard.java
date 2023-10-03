package mod8_concurrency.lesson6_synchronized;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Wizard implements Runnable {

    private String name;
    private BankAccount account;
    private int amountToWithdraw;


    public Wizard(String name, BankAccount account, int amountToWithdraw) {
        this.name = name;
        this.account = account;
        this.amountToWithdraw = amountToWithdraw;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(amountToWithdraw);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
