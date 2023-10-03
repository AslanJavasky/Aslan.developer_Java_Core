package mod3_reflection;

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
        this.house=house;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, My name is " + super.getName() + "! I'm a "+ this.getHouse() +" student of Hogwarts school!");
    }

}
