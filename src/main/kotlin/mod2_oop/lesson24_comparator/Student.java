package mod2_oop.lesson24_comparator;

import mod2_oop.lesson20_interfaces.Introduceable;

import java.time.LocalDate;

public class Student extends Wizard implements Introduceable {

    private String house;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Student(String name, String house) {
        super(name);
        this.house = house;
        this.birthday = LocalDate.now();
    }

    public Student(String name, String house, int age) {
        super(name,age);
        this.house = house;
        this.birthday = LocalDate.now();
    }

    @Override
    public void introduce() {
        System.out.println("Hi, My name is " + super.getName() + "! I'm a " + this.getHouse() + " student of Hogwarts school!");
    }
}
