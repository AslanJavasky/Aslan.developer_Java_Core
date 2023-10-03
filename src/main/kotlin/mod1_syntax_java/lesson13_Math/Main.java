package mod1_syntax_java.lesson13_Math;

import java.lang.Math;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {
        //Math.random()
        var someDouble=Math.random()*1000;
        System.out.println(someDouble);
        //Math.round()
        System.out.println(Math.round(someDouble));
        //Math.sqrt()
        System.out.println(Math.sqrt(64));
        System.out.println(Math.sqrt(16));
        //Math.pow()
        System.out.println(Math.pow(4,2));
        System.out.println((int) Math.pow(8,2));
        System.out.println((int) Math.pow(2,4));//2*2*2*2=16
        //Math.abs()
        System.out.println(Math.abs(-4L));
        //Math.max() Math.min()
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(4,8));

//        Math.PI
//        Math.E

    }


}
