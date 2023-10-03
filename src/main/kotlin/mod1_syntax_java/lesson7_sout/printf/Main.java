package mod1_syntax_java.lesson7_sout.printf;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {

//        System.out.printf("%5.3f",100000.0/3);

        String albus = "Albus Dumbldore";
        int termOfOffice = 40;

//        System.out.println(albus+" was Headmaster of Hogwarts for "+termOfOffice+" years");
        System.out.printf("%s was Headmaster of Hogwarts for %d years", albus, termOfOffice);

        System.out.println();

        String armando = "Armando Dippet";
        int termOfOfficeForDippet = 50;
        System.out.printf("%s was Headmaster of Hogwarts for %d years", armando, termOfOfficeForDippet);

        System.out.println();

//        System.out.printf("%+5.3f", -100000.0 / 3);//sign
//        System.out.printf("%015.3f", 100000.0 / 3);//adds leading zeroes
//        System.out.printf("%,15.3f", 100000.0 / 3);//adds group separator
        System.out.printf("%(15.3f", -100000.0 / 3);//parentheses for negative nums



    }
}
