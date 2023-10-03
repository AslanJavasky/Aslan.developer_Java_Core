package mod1_syntax_java.lesson4_cast_and_operators;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {
        byte i = 1;
        short j = i;
        int z = j;
        double fract = z;

        double num = 8.8456789;
        int var = (int) Math.round(num);
        System.out.println(var);


        var = var + 4;
        var += 4;

        var++;
        var--;

        boolean bool;
        bool = 3 != 5;

        int x = 5, y = 9;
        if (x < y) {
            System.out.println("The smalest x: " + x);
        } else {
            System.out.println("The smalest y: " + y);
        }
        // ?:   condition ? expIfTrue : expIfFalse
        int smalest = x < y ? x : y;
        System.out.println(smalest);


    }
}
