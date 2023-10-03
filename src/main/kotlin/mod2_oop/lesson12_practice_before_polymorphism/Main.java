package mod2_oop.lesson12_practice_before_polymorphism;

/**
 * @author Aslan Javasky, android developer(Java/Kotlin), Telegram messenger: @Aslan_Javasky
 * @version 1.0 2023-09-03
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Character hermione = new Character("Hermione Granger", 11);
        Wizard harry = new Wizard("Harry Potter", 11);

        Character[] people=new Character[3];
        people[0]=hermione;
        people[1]=new Character("Petunia Dursley",49);
        people[2]= harry;

        for (Character item:people){
            item.introduceYourself();
        }


    }
}