package mod4_exceptions;

import java.io.IOException;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        try {

            System.out.println(5/0);//ArithmeticException: / by zero

            int[] arr={1,2};
            arr[2]=3;//ArrayIndexOutOfBoundsException


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {

            String file="unknown";
            if (file.equals("unknown")){
                throw new RuntimeException("message of our exception");
            }
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }




    }
}
