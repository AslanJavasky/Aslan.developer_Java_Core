package mod6_collections_and_maps;

import java.util.*;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        //Array
        String[] studentsArr = new String[2];
        studentsArr[0] = "Harry Potter";
        studentsArr[1] = "Draco Malfoy";
        //studentsArr[2]="Ron Weasley";//ArrayIndexOutOfBoundsException

        //List interface
        List<String> studentsArrList = new ArrayList<>(3);
        studentsArrList.add("Harry Potter");
        studentsArrList.add("Draco Malfoy");
        studentsArrList.add("Ron Weasley");
        studentsArrList.add("Hermione Granger");
        studentsArrList.set(2, "Cedric Diggory");

//        for (int i = 0; i < studentsArrList.size(); i++) {
//            System.out.println(studentsArrList.get(i));
//        }

        List<String> studentsLinked = new LinkedList<>();
        studentsLinked.add("Harry Potter");
        studentsLinked.add("Draco Malfoy");
        studentsLinked.add("Ron Weasley");
        studentsLinked.add("Hermione Granger");
        studentsLinked.set(2, "Cedric Diggory");

//        for (int i = 0; i < studentsLinked.size(); i++) {
//            System.out.println(studentsLinked.get(i));
//        }

        //Set
        studentsArrList.add("Harry Potter");
//        for (int i = 0; i < studentsArrList.size(); i++) {
//            System.out.println(studentsArrList.get(i));
//        }

        Set<String> setOfStudents = new HashSet<>();
//        Set<String> linkedSetOfStudents=new LinkedHashSet<>();
        setOfStudents.add("Harry Potter");
        setOfStudents.add("Draco Malfoy");
        setOfStudents.add("Ron Weasley");
        setOfStudents.add("Hermione Granger");
        setOfStudents.add("Cedric Diggory");
        setOfStudents.add("Harry Potter");
        setOfStudents.add("Harry Potter");
        setOfStudents.add("Harry Potter");
        setOfStudents.add("Harry Potter");

//        for(String studentName:setOfStudents){
//            System.out.println(studentName);
//        }
//        System.out.println();

        Set<String> treeSetOfStudents = new TreeSet<>();
        treeSetOfStudents.add("Harry Potter");
        treeSetOfStudents.add("Draco Malfoy");
        treeSetOfStudents.add("Ron Weasley");
        treeSetOfStudents.add("Hermione Granger");
        treeSetOfStudents.add("Cedric Diggory");
//        for(String studentName:treeSetOfStudents){
//            System.out.println(studentName);
//        }

        //Map
        Map<String, Integer> housePoints = new HashMap<>();
//        Map<String, Integer> housePointsLinked= new LinkedHashMap<>();
//        Map<String, Integer> housePointsTree= new TreeMap<>();
        housePoints.put("Gryffindor", 300);
        housePoints.put("Slytherin", 250);
        housePoints.put("Hufflepuff", 150);
        housePoints.put("Ravenclaw", 220);


        System.out.println("Slytherin has " + housePoints.get("Slytherin") + " points!");
        System.out.println("is Exist Gryffindor house: " + housePoints.containsKey("Gryffindor"));
        System.out.println("is Exist Real Madrid house: " + housePoints.containsKey("Real Madrid"));

//        for (Map.Entry<String,Integer> entry:housePoints.entrySet()){
//            System.out.println("Key: "+entry.getKey()+"; Value: "+entry.getValue());
//        }

        //Queue
        Queue<String> studentsQueue = new PriorityQueue<>();
        studentsQueue.offer("Harry Potter");
        studentsQueue.offer("Draco Malfoy");
        studentsQueue.offer("Ron Weasley");
        studentsQueue.offer("Hermione Granger");
        studentsQueue.offer("Cedric Diggory");

        System.out.println(studentsQueue);

        if (!studentsQueue.isEmpty()){
            String student=studentsQueue.poll();
            System.out.println(student);
        }

        System.out.println(studentsQueue);

        Deque<String> studentsDeque = new ArrayDeque<>();
        studentsDeque.offer("Harry Potter");
        studentsDeque.offer("Draco Malfoy");
        studentsDeque.offer("Ron Weasley");
        studentsDeque.offer("Hermione Granger");
        studentsDeque.offer("Cedric Diggory");

        if (!studentsDeque.isEmpty()) {
            String studentFirst = studentsDeque.pollFirst();
            System.out.println(studentFirst);
        }
    }
}
