import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> mark;

    public Student(String name, ArrayList<Integer> mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
