package mod7_streams.lesson3_reductions;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Student {
    private final String name;
    private final String hogwartsHouse;
    private int  points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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