import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student misha = new Student("Михаил", new int[]{2, 3, 4, 3, 4});
        Student dasha = new Student("Дарья", new int[]{2, 3, 4, 5, 5});
        Student masha = new Student("Мария", new int[]{4, 5, 4, 4, 5});
        Student vanya = new Student("Иван", new int[]{4, 3, 5, 3, 5});
        Student sasha = new Student("Александр", new int[]{3, 5, 4, 5, 2});

        studentList.add(misha);
        studentList.add(dasha);
        studentList.add(masha);
        studentList.add(vanya);
        studentList.add(sasha);

        double sum = studentList.stream()
                .map(x -> x.getGrades())
                .flatMapToInt(Arrays::stream)
                .sum();
        System.out.println("средний балл студентов:" + sum/25);

        ArrayList<Double> gpa = new ArrayList<>();
        gpa.add(Student.average(misha.getGrades()));
        gpa.add(Student.average(dasha.getGrades()));
        gpa.add(Student.average(masha.getGrades()));
        gpa.add(Student.average(vanya.getGrades()));
        gpa.add(Student.average(sasha.getGrades()));

        System.out.println(gpa);
    }

}
