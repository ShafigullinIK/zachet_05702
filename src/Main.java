import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

        createStudents();


        students.stream()
                .forEach(System.out::println);

        double summa = students.stream().map(x -> x.getGrades())
                .flatMapToInt(Arrays::stream)
                .reduce(0, (a, b) -> a + b);
        double  mapStudent = students.stream().map(x -> x.getGrades())
                .flatMapToInt(Arrays::stream).count();
        double sum = summa / mapStudent;
        System.out.println("Для всех студентов мы имеем средний балл = " + sum);

    }



    public static void createStudents() {


        int[] kgrades = new int[] {3,4,3,3,3};
        Student Kate  = new Student( "Kate",kgrades);

        int[] agrades = new int[]{5,5,5,5,5};
        Student Alise = new Student("Alice",agrades);

        int[] bgrades = new int[]{2,2,2,2,2};
        Student Bob = new Student("Bob", bgrades);

        int[] mgrades = new int[] {1,3,2,4,5};
        Student Mary = new Student("Mary",mgrades);

        int[] magrades = new int[] {1,3,2,1,4};
        Student Make = new Student("Make", magrades);

        students.add(Kate);
        students.add(Alise);
        students.add(Bob);
        students.add(Mary);
        students.add(Make);

    }






}






