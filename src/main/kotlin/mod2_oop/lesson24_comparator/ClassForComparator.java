package mod2_oop.lesson24_comparator;

import java.util.Comparator;

public class ClassForComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.age > student2.age){
            return -1;
        } else if (student1.age < student2.age) {
            return 1;
        }else {
            return 0;
        }
    }
}
