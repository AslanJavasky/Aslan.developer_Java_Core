package mod1_syntax_java.lesson3_variables_and_constants;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    static final String headMaster="Albus Dumbldore";

    public static void main(String[] args) {

        int ourVariable1=23,ourVariable2=42;
        System.out.println(Character.isJavaIdentifierStart('o'));
        System.out.println(Character.isJavaIdentifierStart('1'));
        System.out.println(Character.isJavaIdentifierPart('1'));

        final int intVar=4;
//        intVar=8;


    }
}
