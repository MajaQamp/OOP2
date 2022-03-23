package OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainOOP2 {
    public static void main(String[] args) {

        Scanner reader= new Scanner(System.in);

        //Numbers
        ArrayList listOfNumbers = new ArrayList<>();
        listOfNumbers.add(55);
        listOfNumbers.add(5);
        listOfNumbers.add(7);
        listOfNumbers.add(100);

        Numbers numbersToConstructor = new Numbers(listOfNumbers);
        System.out.println("The numbers from the array are: " + listOfNumbers);
        System.out.println("\nThe maximum number is: " + numbersToConstructor.maxNumber());
        System.out.println("\nThe minimum number is: " + numbersToConstructor.minNumber());
        System.out.println("\nThe sum of all numbers is: " + numbersToConstructor.sumOfNumbers());
//        System.out.println("The prime numbers are: " + numbersToConstructor.primeNumbers());

//      Students
        HashMap<Integer, String> studentInfo = new HashMap<>();
        studentInfo.put(1, "Vedo");
        studentInfo.put(2, "Damir");
        studentInfo.put(3, "Senita");
        studentInfo.put(4, "Elmedin");
        studentInfo.put(5, "Maja");

        Student students = new Student(studentInfo);
        students.listAllStudents();

        System.out.println("\nWe will now print only the numbers of the students: ");

        Student number = new Student(studentInfo);
        students.studentNumberOnly();

        System.out.println("\nWe will now print only the names of the students: ");
        Student name = new Student(studentInfo);
        students.studentName();

        System.out.println("\nWe will now add one student: ");
        Student added = new Student(studentInfo);
        students.addStudent();

        System.out.println("\nWe will now replace the student number 5: ");
        Student replace = new Student(studentInfo);
        students.replaceStudent();

        System.out.println("\nWe will now remove one student: ");
        Student removed = new Student(studentInfo);
        students.removeStudent();

        //CoffeeMachine:
        ArrayList coffeeBrands = new ArrayList<>();
        listOfNumbers.add("Lavazza");
        listOfNumbers.add("Illy");
        listOfNumbers.add("Segafredo");
        listOfNumbers.add("Manuel");

        CoffeeMachine brands = new CoffeeMachine(coffeeBrands);
        brands.selectCoffeeBrand();















    }}
