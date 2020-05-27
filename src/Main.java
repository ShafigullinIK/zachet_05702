import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> students = new ArrayList<>();
        int[] assessStud1 = new int[]{3, 4, 5, 4, 5};
        Student student1 = new Student("Гаязов Булат", assessStud1);
        students.add(student1);
        int[] assessStud2 = new int[]{2, 4, 4, 5, 5};
        Student student2 = new Student("Галяутдинов Алексей", assessStud2);
        students.add(student2);
        int[] assessStud3 = new int[]{1, 2, 3, 5, 3};
        Student student3 = new Student("Лысенков Иван", assessStud3);
        students.add(student3);
        int[] assessStud4 = new int[]{3, 4, 3, 5, 4};
        Student student4 = new Student("Шамратов Ахун", assessStud4);
        students.add(student4);
        int[] assessStud5 = new int[]{1, 2, 3, 2, 4};
        Student student5 = new Student("Зекрин Рамиль", assessStud5);
        students.add(student5);

        students.stream()
                .forEach(System.out::println);

        double sum1 = students.stream().map(x -> x.getAssessments())
                .flatMapToInt(Arrays::stream)
                .reduce(0, (x, y) -> x + y);
        double countStudent = students.stream().map(x -> x.getAssessments())
                .flatMapToInt(Arrays::stream).count();
        double sum = sum1 / countStudent;
        System.out.println("Средний бал по всем студентам = " + sum);
    }
}