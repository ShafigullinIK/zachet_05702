import java.util.ArrayList;


public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;


    }

    public String getName() {

        return name;
    }


    public int[] getGrades() {

        return grades;
    }

    private double srsum (int[] array) {
        double sr = 0;
        for (int i = 0; i < array.length; i++) {
            sr += array[i];
        }
        sr/=array.length;
        return sr;
    }


    @Override
    public String toString() {
        return "У " + name + " средняя оценка: " + srsum(grades);
    }


}


