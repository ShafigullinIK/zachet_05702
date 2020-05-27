package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Student {
    private String name;
    private int [] assessments;

    public double average (){
        return IntStream.of(this.assessments)
                .reduce(Integer::sum).getAsInt() / assessments.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", assessments=" + Arrays.toString(assessments) +
                '}';
    }

    public Student(String name, int[] assessments) {
        this.name = name;
        this.assessments = assessments;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getAssessments() {
        return assessments;
    }

    public void setAssessments(int[] assessments) {
        this.assessments = assessments;
    }
}
