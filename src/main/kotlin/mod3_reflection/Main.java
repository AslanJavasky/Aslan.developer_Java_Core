package mod3_reflection;

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


        Character hermione = new Student("Hermione Granger", "Gryffindor");

        //getClass
        Class<? extends Character> instance = hermione.getClass();
        Class<?> instance2 = Class.forName("mod3_reflection.Student");
        Class<Student> instance3 = Student.class;
        //getSuperlass
        var superclass=instance.getSuperclass();
        //Modifiers
        String modifiers= Modifier.toString(instance.getModifiers());//public
        //DeclaredConstructer
        Constructor[] constructors=instance.getDeclaredConstructors();
        for (Constructor elem:constructors){
            System.out.println(elem);//public mod3_reflection.Student(java.lang.String,java.lang.String)
        }
        //DeclaredMethods
        Method[] methods=instance.getDeclaredMethods();
        for (Method elem:methods){
            System.out.println(elem);
            System.out.println(elem.getReturnType());
        }
        //DeclaredFields
        Field [] fieldList=instance.getDeclaredFields();
        for (Field elem:fieldList){
            System.out.println(elem);//private String house;
        }

    }
}