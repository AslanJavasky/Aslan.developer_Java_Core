package mod2_oop.lesson25_inner_class;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-September
 */
public class Main {
    public static void main(String[] args) {

        OuterClass someInstance=new OuterClass();
        someInstance.setOuterField("value1");
        OuterClass.InnerClass inner=new OuterClass.InnerClass();
        inner.setInnerField("value2");
        System.out.println(inner.getInnerField());


    }
}
