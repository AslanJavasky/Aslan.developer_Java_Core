package mod1_syntax_java.lesson15_varargs;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String... args) {


        varargsMethod("one", " two", "three");


    }

    private static void varargsMethod(String... strings) {
        System.out.println(String.join(",",strings));
    }
}
