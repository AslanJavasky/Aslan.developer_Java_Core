package mod7_streams.lesson1_create_stream;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Student {
    private final String name;
    private final String hogwartsHouse;

    public Student(String name, String hogwartsHouse) {
        this.name = name;
        this.hogwartsHouse = hogwartsHouse;
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