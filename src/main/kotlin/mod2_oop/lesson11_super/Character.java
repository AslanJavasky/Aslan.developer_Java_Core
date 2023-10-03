package mod2_oop.lesson11_super;

import java.time.LocalDate;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Character implements Cloneable{

    private String name;
    private int age;

    private LocalDate birthday;

    {
        System.out.println("The new object of class Character is created!");
    }

    private static final String kind = "Human";

    public Character(String name, int age, LocalDate birthday) {
        this(name, age);
        this.birthday = birthday;
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int age) {
        this(name);
        this.age = age;
    }

    public static Character getInstance(
            String name, int age, LocalDate birth
    ) {
        return new Character(name, age, birth);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static String getKind() {
        return kind;
    }


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


    public void introduceYourself() {
        System.out.println("Hi, My name is " + name + "! I'm " + age + " years old.");
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name="+name + ",age=" + age + ",birthday=" + birthday + "]";
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Character clone= (Character) super.clone();
        clone.age=this.age;
        clone.name=this.name;
        clone.birthday=this.birthday;

        return clone;
    }
}
