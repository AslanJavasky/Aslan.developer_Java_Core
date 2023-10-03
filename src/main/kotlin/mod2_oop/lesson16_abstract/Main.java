package mod2_oop.lesson16_abstract;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Character hermione = new Student("Hermione Granger", "Gryffindor");
        Character harry = new Wizard("Harry Potter", 11);

        Character draco=new Student("Draco Malfoy", "Slytherin");
        Character severus=new Teacher("Severus Snape");

        draco.introduceYourself();
        severus.introduceYourself();
        hermione.introduceYourself();
        harry.introduceYourself();
    }
}