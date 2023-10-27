package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar;

import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Student student1 = StudentGenerator.generateRandomStudent();
        Student student2 = StudentGenerator.generateRandomStudent();
        Student student3 = StudentGenerator.generateRandomStudent();
        Student student4 = StudentGenerator.generateRandomStudent();
        Student student5 = StudentGenerator.generateRandomStudent();
        Student student6 = StudentGenerator.generateRandomStudent();
        Student student7 = StudentGenerator.generateRandomStudent();
        Student student8 = StudentGenerator.generateRandomStudent();
        Student student9 = StudentGenerator.generateRandomStudent();
        Student student10 = StudentGenerator.generateRandomStudent();
        Student student11 = StudentGenerator.generateRandomStudent();
        Student student12 = StudentGenerator.generateRandomStudent();
        Student student13 = StudentGenerator.generateRandomStudent();
        Student student14 = StudentGenerator.generateRandomStudent();
        Student student15 = StudentGenerator.generateRandomStudent();
        Student student16 = StudentGenerator.generateRandomStudent();
        Student student17 = StudentGenerator.generateRandomStudent();
        Student student18 = StudentGenerator.generateRandomStudent();
        Student student19 = StudentGenerator.generateRandomStudent();
        Student student20 = StudentGenerator.generateRandomStudent();

        StudentGroup group1 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student1, student2));
        StudentGroup group2 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student3, student4, student5, student6));
        StudentGroup group3 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student7, student8, student9));
        StudentGroup group4 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student10));
        StudentGroup group5 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student11, student12, student13, student14, student15));
        StudentGroup group6 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student16, student17, student18));
        StudentGroup group7 = new StudentGroup(TeacherGenerator.generateRandomTeacher(), List.of(student19, student20));

        Stream stream1 = new Stream(List.of(group1, group2, group3), "789");
        Stream stream2 = new Stream(List.of(group4, group5), "456");
        Stream stream3 = new Stream(List.of(group6, group7), "123");

        List<Stream> streams = new java.util.ArrayList<>(List.of(stream1, stream2, stream3));
        System.out.println(streams);
        streams.sort(new StreamComparator());

        System.out.println(streams);

    }
}
