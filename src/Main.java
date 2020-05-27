import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        int[] mas1 = new int[]{1, 2, 3, 4, 5};
        Student vasya = new Student("Vasya", mas1);
        students.add(vasya);
        int[] mas2 = new int[]{2, 5, 4, 1, 3};
        Student lenar = new Student("Lenar", mas2);
        students.add(lenar);
        int[] mas3 = new int[]{5, 2, 1, 3, 4};
        Student petya = new Student("Petya", mas3);
        students.add(petya);
        int[] mas4 = new int[]{5, 5, 5, 5, 5};
        Student ilnar = new Student("Ilnar", mas4);
        students.add(ilnar);
        int[] mas5 = new int[]{5, 4, 5, 4, 5};
        Student vika = new Student("Vika", mas5);
        students.add(vika);

        double sum = students.stream()
                .map(x -> x.getMas())
                .flatMapToInt(Arrays::stream)
                .reduce(0, (x, y) -> x + y) / 25.0;
        System.out.println("Средний балл = " + sum);
        ArrayList<Double> sr = new ArrayList<>();
        sr.add(Student.people(vasya.getMas()));
        sr.add(Student.people(lenar.getMas()));
        sr.add(Student.people(petya.getMas()));
        sr.add(Student.people(ilnar.getMas()));
        sr.add(Student.people(vika.getMas()));
        System.out.println(sr);
    }
}

