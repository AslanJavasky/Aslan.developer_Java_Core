package mod1_syntax_java.lesson12_arrays;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

//        int[] arrNumbers = new int[6];
//        arrNumbers[0]=4;
//        arrNumbers[1]=8;
//        arrNumbers[2]=15;
//        arrNumbers[3]=16;
//        arrNumbers[4]=23;
//        arrNumbers[5]=42;
//        arrNumbers[6]=108;java.lang.ArrayIndexOutOfBoundsException


        int[] arrNumbers = {4, 8, 15, 16, 23, 42};

        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println(arrNumbers[i]);
        }

        //task
        String [] housesHogwarts={"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"};
//        for (int i = 0; i < housesHogwarts.length; i++) {
//            System.out.println(housesHogwarts[i]);
//        }
        for (String house:housesHogwarts) {
            System.out.println(house);
        }


    }
}
