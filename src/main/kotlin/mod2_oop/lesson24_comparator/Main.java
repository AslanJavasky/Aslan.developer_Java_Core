package mod2_oop.lesson24_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        Student[] studentsOfHohwarts = {
                new Student("Harry Potter", "Gryffindor", 13),
                new Student("Draco Malfoy", "Slytherin", 11),
                new Student("Hermione Granger", "Gryffindor", 12),
                new Student("Ron Weasley", "Gryffindor", 15)
        };

        System.out.println("Array before sorting: " + Arrays.toString(studentsOfHohwarts));
        //case with class which impl Comparator
//        Arrays.sort(studentsOfHohwarts, new ClassForComparator());
        //case with Comparator.comparing and method-reference
//        Arrays.sort(studentsOfHohwarts,Comparator   . comparing(Student::getAge));
        //case with Comparator.comparing and lambda
        Arrays.sort(studentsOfHohwarts,Comparator.comparing(student -> student.getAge()));
        System.out.println("Sorted array: " + Arrays.toString(studentsOfHohwarts));
    }
}