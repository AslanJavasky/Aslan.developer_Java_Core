package mod8_concurrency.lesson10_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        Callable callable = () -> {
            double result=0;
            for (int i = 0; i < 500; i++) {
                result += Math.random();
            }
            if (result/100<3){
                throw new Exception("The result less than 3!");
            }
            return result/100;
        };

        FutureTask<Double> futureTask=new FutureTask<>(callable);
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
