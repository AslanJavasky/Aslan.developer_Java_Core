package mod2_oop.lesson6_factory_methods;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
import java.time.LocalDate;

public class Character {

    private final String name;
    private int age;

    private LocalDate birthday;

    private static final String kind = "Human";

    public Character(String name, int age, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public static Character getInstance(
            String name, int age, LocalDate birth
    ) {
        return new Character(name,age,birth);
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
        return "Character[name="+name+",age="+age+",birthday="+birthday+"]";
    }
}
