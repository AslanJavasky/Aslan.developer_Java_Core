package mod2_oop.lesson10_inheritance;

import java.time.LocalDate;
import java.util.Random;

public class Wizard extends Character {

    private long accountNumberGringottsBank= new Random().nextLong(Long.MAX_VALUE);

    public long getAccountNumberGringottsBank() {
        return accountNumberGringottsBank;
    }

    public Wizard(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name="+super.getName() + ",age=" + super.getAge() + ",birthday=" + super.getBirthday() + ", accountNumberGringottsBank="+this.getAccountNumberGringottsBank()+"]";
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, My name is " + super.getName() + "! I'm a wizard!");
    }
}
