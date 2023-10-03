package mod2_oop.lesson13_polymorphism;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Character hermione = new Character("Hermione Granger", 11);
        Wizard harry = new Wizard("Harry Potter", 11);

        Character student;
        student= harry;

        harry.introduceYourself();
        hermione.introduceYourself();

        System.out.println(harry);
        System.out.println(hermione);

    }
}