package mod2_oop.lesson20_interfaces;

public class Teacher extends Wizard implements Introduceable  {
    public Teacher(String name) {
        super(name);
    }


    @Override
    public void introduce() {
        System.out.println("Hi, My name is " + super.getName() + "! I'm a teacher of Hogwarts school!");
    }
}
