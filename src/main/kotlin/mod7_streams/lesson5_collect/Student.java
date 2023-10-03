package mod7_streams.lesson5_collect;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Student {
    private final String name;
    private final String hogwartsHouse;
    private int  points;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String hogwartsHouse, int age,int points ) {
        this.name = name;
        this.hogwartsHouse = hogwartsHouse;
        this.points = points;
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Student(String name, String hogwartsHouse) {
        this.name = name;
        this.hogwartsHouse = hogwartsHouse;
    }

    public Student(String name, String hogwartsHouse, int points) {
        this.name = name;
        this.hogwartsHouse = hogwartsHouse;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getHogwartsHouse() {
        return hogwartsHouse;
    }

    @Override
    public String toString() {
        return name + " - " + hogwartsHouse;
    }
}