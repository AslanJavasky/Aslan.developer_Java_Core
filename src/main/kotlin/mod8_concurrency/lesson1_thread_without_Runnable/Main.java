package mod8_concurrency.lesson1_thread_without_Runnable;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {


        var harry=new StudentThread("Harry Potter");
        var hermione=new StudentThread("Hermione Granger");
        harry.start();
        hermione.start();








    }
}
