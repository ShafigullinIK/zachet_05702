import java.util.ArrayList;

public class Main {

    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        createStudents();
        students.stream()
                .map(student -> student.getGrades())
                .flatMap(arrayListGrages -> arrayListGrages.stream())
                .map(Integer -> Integer)
                .forEach(System.out::println);

        System.out.println(students);
    }


    //Map<Genre, Long> map = albums.stream()
    //.map(x -> x.getTracks())
    //.flatMap(x-> x.stream())
    //.collect(Collectors.groupingBy(x -> x.getGenre(), Collectors.counting()));
    //System.out.println(map);
    //}

    public static void createStudents() {


        ArrayList<Integer> kgrades = new ArrayList<Integer>();
        kgrades.add(1);
        kgrades.add(2);
        kgrades.add(3);
        kgrades.add(4);
        kgrades.add(5);
        int[] kateArray = new int[] { 4,4,4,4,4 };
        Student Kate  = new Student( "Kate",kgrades);

        ArrayList<Integer> agrades = new ArrayList<Integer>();
        agrades.add(4);
        agrades.add(4);
        agrades.add(3);
        agrades.add(4);
        agrades.add(5);

        Student Alise = new Student("Alice",agrades);

        ArrayList<Integer> bgrades = new ArrayList<Integer>();
        bgrades.add(1);
        bgrades.add(2);
        bgrades.add(3);
        bgrades.add(4);
        bgrades.add(5);
        Student Bob = new Student("Bob", bgrades);

        ArrayList<Integer> mgrades = new ArrayList<Integer>();
        mgrades.add(5);
        mgrades.add(5);
        mgrades.add(3);
        mgrades.add(5);
        mgrades.add(5);
        Student Mary = new Student("Mary",mgrades);

        ArrayList<Integer> magrades = new ArrayList<Integer>();
        magrades.add(1);
        magrades.add(2);
        magrades.add(3);
        magrades.add(3);
        magrades.add(3);
        Student Make = new Student("Make", magrades);

        students.add(Kate);
        students.add(Alise);
        students.add(Bob);
        students.add(Mary);
        students.add(Make);

    }






}