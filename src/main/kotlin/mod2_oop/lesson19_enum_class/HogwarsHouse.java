package mod2_oop.lesson19_enum_class;

public enum HogwarsHouse {

    GRYFFINDOR("orange"),
    SLYTHERIN("green"),
    HUFFLEPUFF("yellow"),
    RAVENCLAW("blue");

    private String themeColor;

    public String getThemeColor() {
        return themeColor;
    }

    HogwarsHouse(String themeColor) {
        this.themeColor = themeColor;
    }
}
