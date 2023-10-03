package mod2_oop.lesson3_encapsulation;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Character {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
