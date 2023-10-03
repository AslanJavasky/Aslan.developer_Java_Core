package mod2_oop.lesson18_object;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main extends Object{
    public static void main(String[] args) throws CloneNotSupportedException {


        Character hermione = new Student("Hermione Granger", "Gryffindor");
        Character harry = new Student("Harry Potter", "Gryffindor");

//        System.out.println(harry.equals(harry));
        Character other=harry;
        System.out.println(harry.hashCode());
        System.out.println(other.hashCode());
//        System.out.println(hermione.hashCode());


    }
}