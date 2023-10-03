package mod7_streams.lesson1_create_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> hogwartsStudents = new ArrayList<>();

        // Adding 20 Hogwarts students to the ArrayList
        hogwartsStudents.add(new Student("Harry Potter", "Gryffindor"));
        hogwartsStudents.add(new Student("Hermione Granger", "Gryffindor"));
        hogwartsStudents.add(new Student("Ron Weasley", "Gryffindor"));
        hogwartsStudents.add(new Student("Draco Malfoy", "Slytherin"));
        hogwartsStudents.add(new Student("Luna Lovegood", "Ravenclaw"));
        hogwartsStudents.add(new Student("Neville Longbottom", "Gryffindor"));
        hogwartsStudents.add(new Student("Ginny Weasley", "Gryffindor"));
        hogwartsStudents.add(new Student("Fred Weasley", "Gryffindor"));
        hogwartsStudents.add(new Student("George Weasley", "Gryffindor"));
        hogwartsStudents.add(new Student("Cho Chang", "Ravenclaw"));
        hogwartsStudents.add(new Student("Cedric Diggory", "Hufflepuff"));
        hogwartsStudents.add(new Student("Hannah Abbott", "Hufflepuff"));
        hogwartsStudents.add(new Student("Seamus Finnigan", "Gryffindor"));
        hogwartsStudents.add(new Student("Dean Thomas", "Gryffindor"));
        hogwartsStudents.add(new Student("Padma Patil", "Ravenclaw"));
        hogwartsStudents.add(new Student("Parvati Patil", "Gryffindor"));
        hogwartsStudents.add(new Student("Vincent Crabbe", "Slytherin"));
        hogwartsStudents.add(new Student("Gregory Goyle", "Slytherin"));
        hogwartsStudents.add(new Student("Pansy Parkinson", "Slytherin"));
        hogwartsStudents.add(new Student("Millicent Bulstrode", "Slytherin"));

        //without stream
        int cnt = 0;
        for (Student student : hogwartsStudents) {
            if (student.getHogwartsHouse().equals("Gryffindor")) {
                cnt++;
            }
        }

        //with stream
//        int count = (int) hogwartsStudents.stream()
//                .filter(student -> student.getHogwartsHouse().equals("Ravenclaw"))
//                .count();
//        System.out.println("The number of Gryffindor students is "+count);

//        hogwartsStudents.stream()
//                .filter(student -> student.getHogwartsHouse().equals("Ravenclaw"))
//                .forEach(System.out::println);

//        Arrays.stream(hogwartsStudents.toArray())
//                .map(student -> (Student) student)
//                .filter(student -> "Ravenclaw".equals(student.getHogwartsHouse()))
//                .forEach(System.out::println);


        Stream<Integer> numsStream = Stream.of(4, 8, 15, 16, 23, 42);
//        numsStream.forEach(System.out::println);

//        Stream.iterate(1, x -> x+1).forEach(System.out::println);
        Stream.generate(Math::random).forEach(System.out::println);

    }
}
