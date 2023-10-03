package mod7_streams.lesson5_collect;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class DemoGrouping {
    public static void main(String[] args) {

        ArrayList<Student> hogwartsStudents = new ArrayList<>();

        // Adding Hogwarts students to the ArrayList
        hogwartsStudents.add(new Student("Harry Potter", "Gryffindor", 18, 100));
        hogwartsStudents.add(new Student("Hermione Granger", "Gryffindor", 17, 95));
        hogwartsStudents.add(new Student("Luna Lovegood", "Ravenclaw", 16, 85));
        hogwartsStudents.add(new Student("Draco Malfoy", "Slytherin", 18, 75));
        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff", 19, 90));

        Map<String,Long> studentCountByHouse=hogwartsStudents.stream()
                .collect(Collectors.groupingBy(Student::getHogwartsHouse,Collectors.counting()));
        System.out.println(studentCountByHouse);

        Map<String,Integer> totalPointsByHouse=hogwartsStudents.stream()
                .collect(Collectors.groupingBy(Student::getHogwartsHouse,Collectors.summingInt(Student::getPoints)));
        System.out.println("Total Points by House: " + totalPointsByHouse);


        Map<String, Optional<Student>> topStudentByHouse = hogwartsStudents.stream()
                .collect(Collectors.groupingBy(
                        Student::getHogwartsHouse,
                        Collectors.maxBy(Comparator.comparing(Student::getPoints))));
        System.out.println("Top Student by House: " + topStudentByHouse);

        Map<String, Optional<Student>> StudentWithMinPointsByHouse = hogwartsStudents.stream()
                .collect(Collectors.groupingBy(
                        Student::getHogwartsHouse,
                        Collectors.minBy(Comparator.comparing(Student::getPoints))));
        System.out.println("Students with Min Points by House: " + StudentWithMinPointsByHouse);


        Map<String, Optional<Student>> youngestStudentByHouse=hogwartsStudents.stream()
                .collect(Collectors.groupingBy(Student::getHogwartsHouse,
                        Collectors.minBy(Comparator.comparing(Student::getAge))));
        System.out.println("Youngest Student by House: " + youngestStudentByHouse);

        Map<String,List<String>> studentsNamesByHouse=hogwartsStudents.stream()
                .collect(Collectors.groupingBy(Student::getHogwartsHouse,
                        Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println("Students' Names by House: " + studentsNamesByHouse);

        Map<String, IntSummaryStatistics> summaryStatisticsMap =hogwartsStudents.stream()
                .collect(Collectors.groupingBy(Student::getHogwartsHouse,
                        Collectors.summarizingInt(Student::getPoints)));
        System.out.println("Point Summary by House: " + summaryStatisticsMap);



    }
}
