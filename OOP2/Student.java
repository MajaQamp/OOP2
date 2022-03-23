package OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {

    public HashMap<Integer, String> studentInfo;

    public Student(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }

    public HashMap<Integer, String> getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }

    public void listAllStudents() {

        for (Map.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println("\nThe student number " + singleStudent.getKey() + " is " + singleStudent.getValue());
        }
    }

    public void studentNumberOnly() {
        for (Map.Entry studentNumber : studentInfo.entrySet()) {
            System.out.println(studentNumber.getKey());
        }
    }

    public void studentName() {
        for (Map.Entry studentName : studentInfo.entrySet()) {
            System.out.println(studentName.getValue());
        }
    }

    public void removeStudent() {
        studentInfo.remove(5);
        for (Map.Entry removedStudent : studentInfo.entrySet()) {
        System.out.println(removedStudent.getKey() + " " + removedStudent.getValue());
        }
    }

    public void addStudent() {
        studentInfo.put(6, "Beis");
        for (Map.Entry addStudent : studentInfo.entrySet()) {
            System.out.println(addStudent.getKey() + " " + addStudent.getValue());
        }
    }

        public void replaceStudent () {
            studentInfo.replace(5, "Elma");
            for (Map.Entry replaceStudent : studentInfo.entrySet()) {
                System.out.println(replaceStudent.getKey() + " " + replaceStudent.getValue());
            }


        }
    }
