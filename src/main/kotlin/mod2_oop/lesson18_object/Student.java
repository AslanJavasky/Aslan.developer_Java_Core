package mod2_oop.lesson18_object;

import java.util.Objects;

public class Student extends Wizard {

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
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, My name is " + super.getName() + "! I'm a " + this.getHouse() + " student of Hogwarts school!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        var otherStudent = (Student) obj;


        return this.name == otherStudent.name && this.age == otherStudent.age
                && this.house == otherStudent.house
                && this.birthday == otherStudent.birthday
                && this.accountNumberGringottsBank == otherStudent.accountNumberGringottsBank;

    }

    @Override
    public int hashCode() {
        return Objects.hash(house, name, age, birthday);
    }
}
