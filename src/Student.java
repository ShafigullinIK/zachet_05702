import java.util.Arrays;
public class Student {
    private String name;
    private int[] mas;
    private double avr;
    public Student(String name, int[] assessments) {
        this.name = name;
        this.mas = assessments;
    }
    public String getName() {
        return name;
    }
    public int[] getMas() {
        return mas;
    }

    public static double people(int[] mas) {
        int h = 0;
        double a = Arrays.stream(mas)
                .sum();
        return a / mas.length;
    }

}
