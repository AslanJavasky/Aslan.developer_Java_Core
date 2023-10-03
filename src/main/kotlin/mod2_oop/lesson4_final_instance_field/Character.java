package mod2_oop.lesson4_final_instance_field;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Character {

    private final String name;
    private int age;


    public Character(String name, int age) {
        this.name = name;
        this.age = age;
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
