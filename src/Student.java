import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        grades = new ArrayList<Integer>();


    }

    public String getName() {
        return name;
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }






    @Override
    public  String toString() {
        return "Student{" + ", name='" + name + "," + ", grades =" + grades + "}";
    }

}


