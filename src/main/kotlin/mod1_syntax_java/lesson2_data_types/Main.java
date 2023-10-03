package mod1_syntax_java.lesson2_data_types;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) {
        //byte (1 byte) -128..127
        byte a=3;
        //short (2 byte) -32 768..32 767
        short b=32_000;
        //int (4 byte) -2 billion ..2 billion
        int c=32_000_000;
        var d=32_000_000;
        //long (8 byte)
        long e=32_000_000_000_000_000L;

        //float (4 bytes)
        float f=3.6F;
        //double (8 bytes)
        var h=3.9;
        double g=3.9;

        System.out.println(g/0 == Double.POSITIVE_INFINITY);
        System.out.println(g/0 == Double.NEGATIVE_INFINITY);
        System.out.println(Double.isNaN(g));

        //char
        char symb='A';
        //special chars \n \r \" \' \\
        System.out.println("Aslan Javasky \" ");

        //boolean (true or false)
        boolean condition=false;



    }
}
