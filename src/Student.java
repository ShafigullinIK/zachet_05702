import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> rating = new ArrayList<>();

    public String getName(){return name;}
    public ArrayList<Integer> getRating(){return rating;}

    public Student(String name, ArrayList rating){
        this.name = name;
        this.rating = rating;
    }
//    public int sum(){return sum();
//    }
    @Override
    public String toString(){
        return "Студент " +  name +
                " получил оценки " + rating;
    }
}
