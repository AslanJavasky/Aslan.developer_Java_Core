package mod2_oop.lesson5_static_field_and_methods;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Character {

    private final String name;
    private int age;

    private static final String kind = "Human";

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getKind() {
        return kind;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void introduceYourself() {
        System.out.println("Hi, My name is " + name + "! I'm " + age + " years old.");
    }


}
