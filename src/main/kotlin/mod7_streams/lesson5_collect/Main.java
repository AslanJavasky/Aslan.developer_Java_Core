package mod7_streams.lesson5_collect;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> hogwartsStudents = new ArrayList<>();
        hogwartsStudents.add(new Student("Harry Potter", "Gryffindor",50));
//        hogwartsStudents.add(new Student("Harry Potter", "Gryffindor"));
//        hogwartsStudents.add(new Student("Harry Potter", "Gryffindor"));
        hogwartsStudents.add(new Student("Hermione Granger", "Gryffindor",100));
//        hogwartsStudents.add(new Student("Hermione Granger", "Gryffindor"));
        hogwartsStudents.add(new Student("Luna Lovegood", "Ravenclaw",30));
        hogwartsStudents.add(new Student("Draco Malfoy", "Slytherin",40));
//        hogwartsStudents.add(new Student("Draco Malfoy", "Slytherin"));
        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff",55));
//        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff"));
//        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff"));
//        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff"));
//        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff"));

        List<String> studentNames = hogwartsStudents.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Student Names : " + studentNames);

        Set<String> studentUniqueNames = hogwartsStudents.stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
        System.out.println("Student Unique Names : " + studentUniqueNames);


        LinkedList<String> linked = hogwartsStudents.stream()
                .map(Student::getName)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Student Names : " + linked);

        String joinedNames = hogwartsStudents.stream()
                .map(Student::getName)
                .distinct()
                .collect(Collectors.joining(","));

        System.out.println("Joined names: " + joinedNames);

        Map<String, String> studentMap = hogwartsStudents.stream()
                .collect(Collectors.toMap(Student::getName, Student::getHogwartsHouse));
        System.out.println("Student map: " + studentMap);

        Map<String, List<Student>> studentsByHouse = hogwartsStudents.stream()
                .collect(Collectors.groupingBy(Student::getHogwartsHouse));
        studentsByHouse.forEach((house, student) ->
                System.out.println(house + ": " + student));

        Map<Boolean, List<Student>> partitionedStudents= hogwartsStudents.stream()
                .collect(Collectors.partitioningBy(student -> student.getPoints()>=50));
        System.out.println("Students well study : "+partitionedStudents.get(true));
        System.out.println("Students poorly study : "+partitionedStudents.get(false));




    }
}
