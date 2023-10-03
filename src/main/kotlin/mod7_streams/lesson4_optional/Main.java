package mod7_streams.lesson4_optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;

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


        Optional<Student> optionalStudent = hogwartsStudents.stream()
                .filter(student -> student.getHogwartsHouse().equals("IT department"))
                .findFirst();
//        if (optionalStudent.isPresent()) {
        if (optionalStudent.isEmpty()) {
            System.out.println(optionalStudent);
        }

        Optional<String> stringNullable=Optional.empty();
        System.out.println(stringNullable.orElse("Unknown"));
        System.out.println(stringNullable.orElseGet(() -> Locale.getDefault().getDisplayName()));

        stringNullable.orElseThrow(RuntimeException::new);


    }
}
