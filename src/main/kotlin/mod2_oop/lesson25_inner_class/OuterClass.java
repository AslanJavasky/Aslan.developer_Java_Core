package mod2_oop.lesson25_inner_class;

public class OuterClass {

    String outerField;

    public String getOuterField() {
        return outerField;
    }
    public void setOuterField(String outerField) {
        this.outerField = outerField;
    }

    public static class InnerClass{

        String innerField;

        public String getInnerField() {
            return innerField;
        }

        public void setInnerField(String innerField) {
            this.innerField = innerField;
        }
    }


}
