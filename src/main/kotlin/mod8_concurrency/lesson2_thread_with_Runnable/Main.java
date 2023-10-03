package mod8_concurrency.lesson2_thread_with_Runnable;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {


        Thread harry = new Thread(new StudentThread("Harry Potter"));
        Thread hermione = new Thread(new StudentThread("Hermione Granger"));
        harry.start();
        hermione.start();


    }
}
