package mod2_oop.lesson17_protected;

public class Teacher extends Wizard {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, My name is " + super.getName() + "! I'm a teacher of Hogwarts school!");
    }

}
