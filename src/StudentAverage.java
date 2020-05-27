public class StudentAverage
{
    String name;
    double average;
    public StudentAverage(String name, double average)
    {
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Студент='" + name + '\'' +
                ", Средняя оценка=" + average;
    }
}
