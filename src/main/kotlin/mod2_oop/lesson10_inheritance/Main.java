package mod2_oop.lesson10_inheritance;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Character hermione=new Character("Hermione Granger");
        Wizard harry = new Wizard("Harry Potter");

        hermione.introduceYourself();
        harry.introduceYourself();


    }
}