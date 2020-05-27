import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); //эррейлист студентов
        Student ivan = new Student("Иван", marksArr(5));
        Student alia = new Student("Алия", marksArr(5));
        Student alina = new Student("Алина", marksArr(5));
        Student artur = new Student("Артур", marksArr(5));
        Student diana = new Student("Диана", marksArr(5));
        students.add(ivan);
        students.add(alia);
        students.add(alina);
        students.add(artur);
        students.add(diana);
//оценка среднего для каждого студента
        students.forEach(student -> {
            System.out.print(student.getName());
            student
                    .getMark()
                    .stream()
                    .mapToInt(x -> x)
                    .average()
                    .ifPresent(x -> System.out.println(" - Средняя оценка: " + x));
        });

        System.out.println();

//общая оценка сренего

        students.stream()
                .mapToDouble(x -> x.getMark()
                        .stream()
                        .mapToInt(i -> i)
                        .average()
                        .getAsDouble())
                .average()
                .ifPresent(x -> System.out.println("Общая средняя оценка: " + x));


    }

    private static ArrayList<Integer> marksArr(int a) {
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            marks.add(new Random().nextInt(5) + 1);
        }
        return marks;
    }
}

