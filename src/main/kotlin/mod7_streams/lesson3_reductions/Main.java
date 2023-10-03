package mod7_streams.lesson3_reductions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> hogwartsStudents = new ArrayList<>();
        hogwartsStudents.add(new Student("Harry Potter", "Gryffindor", 23));
        hogwartsStudents.add(new Student("Hermione Granger", "Gryffindor", 42));
        hogwartsStudents.add(new Student("Ron Weasley", "Gryffindor", 123));
        hogwartsStudents.add(new Student("Draco Malfoy", "Slytherin", 34));
        hogwartsStudents.add(new Student("Luna Lovegood", "Ravenclaw", 56));
        hogwartsStudents.add(new Student("Neville Longbottom", "Gryffindor", 12));
        hogwartsStudents.add(new Student("Ginny Weasley", "Gryffindor", 7));
        hogwartsStudents.add(new Student("Fred Weasley", "Gryffindor", 90));
        hogwartsStudents.add(new Student("George Weasley", "Gryffindor", 87));
        hogwartsStudents.add(new Student("Cho Chang", "Ravenclaw", 43));
        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff", 12));
        hogwartsStudents.add(new Student("Hannah Abbott", "Hufflepuff", 56));
        hogwartsStudents.add(new Student("Seamus Finnigan", "Gryffindor", 87));
        hogwartsStudents.add(new Student("Dean Thomas", "Gryffindor", 56));
        hogwartsStudents.add(new Student("Padma Patil", "Ravenclaw", 90));
        hogwartsStudents.add(new Student("Parvati Patil", "Gryffindor", 91));
        hogwartsStudents.add(new Student("Vincent Crabbe", "Slytherin", 82));
        hogwartsStudents.add(new Student("Gregory Goyle", "Slytherin", 36));
        hogwartsStudents.add(new Student("Pansy Parkinson", "Slytherin", 84));
        hogwartsStudents.add(new Student("Millicent Bulstrode", "Slytherin", 94));

        //max min
        Optional<Student> studentWithMaxPoints = hogwartsStudents.stream()
                .max(Comparator.comparing(Student::getPoints));
        System.out.println(studentWithMaxPoints.orElse(new Student("unknown", "unknown ", 0)));
        Optional<Student> studentWithMinPoints = hogwartsStudents.stream()
                .min(Comparator.comparing(Student::getPoints));
        System.out.println(studentWithMinPoints);

        //avg point of gryffindor student
        Double avg = hogwartsStudents.stream()
                .filter(student -> student.getHogwartsHouse().equals("Gryffindor"))
                .mapToInt(Student::getPoints)
                .average()
                .getAsDouble();
        System.out.println("The average value of points of Gryffindor student is " + avg);
        //sum poit of slytherin students
        Integer sum = hogwartsStudents.stream()
                .filter(student -> student.getHogwartsHouse().equals("Slytherin"))
                .mapToInt(Student::getPoints)
                .sum();
        System.out.println("The total point of Slytherin students is " + sum);
        Integer sumByReduceMethod = hogwartsStudents.stream()
                .filter(student -> student.getHogwartsHouse().equals("Slytherin"))
                .mapToInt(Student::getPoints)
                .reduce(0, (a, b) -> a + b);
        System.out.println("The total point of Slytherin students is " + sumByReduceMethod);

        //ifPresent
        Optional<Student> optionalStudent = hogwartsStudents.stream()
                .filter(student -> student.getHogwartsHouse().equals("IT department"))
                .findFirst();
        if (optionalStudent.isPresent()) {
            System.out.println(optionalStudent);
        }

    }
}
