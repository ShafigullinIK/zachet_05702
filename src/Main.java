import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        createStudent();
        students.stream()
                .map(x -> x.getRating())
                .flatMap(x -> x())
                .forEach(System.out::println);
    }


    public static void createStudent(){
        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(3);
        arr1.add(1);
        Student a = new Student("Вася", arr1);
        students.add(a);


        ArrayList<Integer> arr2 = new ArrayList();
        arr2.add(3);
        arr2.add(1);
        arr2.add(5);
        Student b = new Student("Лена", arr2);
        students.add(b);

        ArrayList<Integer> arr3 = new ArrayList();
        arr3.add(3);
        arr3.add(1);
        arr3.add(5);
        arr3.add(4);
        Student c = new Student("Катя", arr3);
        students.add(c);

        ArrayList<Integer> arr4 = new ArrayList();
        arr4.add(3);
        arr4.add(1);
        arr4.add(5);
        Student d = new Student("Оля", arr4);
        students.add(d);

        ArrayList<Integer> arr5 = new ArrayList();
        arr5.add(5);
        arr5.add(4);
        Student e = new Student("Саша", arr4);
        students.add(e);
    }
}
