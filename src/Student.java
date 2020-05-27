public class Student {
    private String name;
    private int[] assessments;

    public Student(String name, int[] assessments) {
        this.name = name;
        this.assessments = assessments;
    }

    public int[] getAssessments() {
        return assessments;
    }

    private double averageRate(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= array.length;
        return average;
    }

    @Override
    public String toString() {
        return "У студента " + name + " средний балл: " + averageRate(assessments);
    }
}
