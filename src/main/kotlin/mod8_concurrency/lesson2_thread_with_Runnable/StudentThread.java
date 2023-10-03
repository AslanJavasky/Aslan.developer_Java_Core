package mod8_concurrency.lesson2_thread_with_Runnable;


/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class StudentThread implements Runnable {

    String name;

    public StudentThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + " starts studying");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is studying for Exam :" + i);
            try {
                Thread.sleep(4_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(name + " has finished studying for all Exams!");

    }
}
