package mod1_syntax_java.lesson11_big_numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class BigNumberClass {
    public static void main(String[] args) {

       BigInteger bigNum=new BigInteger("11111111111111111111111111111111111111111");
       BigInteger bigNum2=BigInteger.valueOf(200);

        System.out.println(bigNum.add(bigNum2));
        System.out.println(bigNum.multiply(bigNum2));
        System.out.println(bigNum.divide(bigNum2));
        System.out.println(bigNum.subtract(bigNum2));

        //constants of BigInteger
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TWO);
        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.TEN);

        //task
        System.out.println(bigNum.multiply(BigInteger.ZERO));


        BigDecimal bigDec=new BigDecimal("11111111111111111111111111111111111111.111");
        BigDecimal bigDec2=BigDecimal.valueOf(200);

        System.out.println(bigDec.add(bigDec2));
        System.out.println(bigDec.multiply(bigDec2));
        System.out.println(bigDec.divide(bigDec2));
        System.out.println(bigDec.subtract(bigDec2));

        //constants of BigDecimal
        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.TWO);
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.TEN);

        //task
        System.out.println(bigDec.multiply(BigDecimal.ZERO));


    }
}
