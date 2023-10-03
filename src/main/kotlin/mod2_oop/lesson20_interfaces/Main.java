package mod2_oop.lesson20_interfaces;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {


        Wizard hermione = new Student("Hermione Granger", "Gryffindor",11);
        Wizard harry = new Student("Harry Potter", "Gryffindor",12);


        System.out.println(hermione.compareTo(harry));


//        hermione.introduce();
//        severus.introduce();


//        Integer firstNum=15;
//        Integer secondNum=15;
//
//        String firstStr="f";
//        String secondStr="f";
//
////        System.out.println(firstNum.compareTo(secondNum));
//        System.out.println(firstStr.compareTo(secondStr));


    }
}