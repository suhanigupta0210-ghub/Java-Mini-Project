package com.studyopedia;

public class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}