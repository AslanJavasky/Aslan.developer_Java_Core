package mod8_concurrency.lesson7_volatile;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        BankAccount pottersAccount=new BankAccount(1000000);

        Wizard harry=new Wizard("Harry Potter",pottersAccount, 300 );
        Wizard ginny=new Wizard("Ginny Weasley",pottersAccount, 500 );

        var harryThread=new Thread(harry);
        var ginnyThread=new Thread(ginny);

        harryThread.start();
        ginnyThread.start();


        try {
            harryThread.join();
            ginnyThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final balance in Gringotts Vault: " + pottersAccount.getBalance());



    }
}
