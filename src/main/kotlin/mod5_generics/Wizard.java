package mod5_generics;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Wizard<T extends Number> {

    private T id;

    private String name;
    private String house;
    private LocalDate birthday;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
