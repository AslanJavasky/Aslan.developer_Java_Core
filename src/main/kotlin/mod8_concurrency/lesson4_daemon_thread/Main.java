package mod8_concurrency.lesson4_daemon_thread;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {


        Thread harry = new Thread(new StudentThread("Harry Potter"));
        Thread hermione = new Thread(new StudentThread("Hermione Granger"));
        System.out.println("The state before start() : " + harry.getState());
        harry.start();
        hermione.start();

        try{
            harry.setDaemon(true);
        }catch(IllegalThreadStateException e){
            e.printStackTrace();
//            harry.setDaemon(false);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The state after sleep() : " + harry.getState());

        try {
            harry.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The state after join() : " + harry.getState());


    }
}
