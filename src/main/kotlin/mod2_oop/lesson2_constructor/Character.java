package mod2_oop.lesson2_constructor;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Character {

    String name;
    int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Character() { }

    public Character(String name) {
        this.name = name;
    }

    public Character(int age) {
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("Hi, My name is " + name + "! I'm " + age + " years old.");
    }


}
