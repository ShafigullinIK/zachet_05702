import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args)  throws Exception {

        Student[] students = {
                new Student("Максим Иванов", new int[]{1, 2, 3, 4, 5}),
                new Student("Алексей Сухово", new int[]{5, 5, 5, 5, 5}),
                new Student("Денис Волов", new int[]{3, 2, 3, 5, 5}),
                new Student("Зиля Красильникова", new int[]{5, 4, 3, 4, 5}),
                new Student("Борис Николаев", new int[]{1, 2, 1, 2, 1}),
        };
        // средняя оценка по каждому

        Arrays.stream(students)
                .map(s -> new StudentAverage(s.name,
                        IntStream.of(s.Otzenki).average().orElse(0)))
                .forEach(System.out::println);

        // Общая средняя оценка
        double all_students_avg = Arrays.stream(students)
                .map(s -> s.Otzenki)
                .flatMapToInt(Arrays::stream).average().orElse(0);

        System.out.println(all_students_avg);


    }
}
