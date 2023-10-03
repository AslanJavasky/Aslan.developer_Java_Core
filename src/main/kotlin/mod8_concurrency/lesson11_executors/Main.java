package mod8_concurrency.lesson11_executors;

import java.util.concurrent.*;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {


        //Executor execute()
//        Runnable runnable =  () -> {
//            double result=0;
//            for (int i = 0; i < 500; i++) {
//                System.out.println(Math.random());
//            }
//
//        };
//
//        Executor executor= Executors.newSingleThreadExecutor();
//        executor.execute(runnable);




        Callable callable = () -> {
            double result=0;
            for (int i = 0; i < 500; i++) {
                result += Math.random();
            }
//            if (result/100<3){
//                throw new Exception("The result less than 3!");
//            }
            return result/100;
        };

        ExecutorService service=Executors.newSingleThreadExecutor();
        Future<Double> future=service.submit(callable);

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
