import java.io.*;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManagementSystem {

    private static final String DATA_FILE = "students.txt";
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        loadStudents();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    editStudent(scanner);
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    displayAllStudents();
                    break;
            }
        } while (choice != 5);

        saveStudents();
        System.out.println("Goodbye!");
    }

    private static void loadStudents() {
        // Load students from the file and populate the 'students' list
        // Implementation will depend on your chosen storage format (file, database, etc.)
    }

    private static void saveStudents() {
        // Save students to the file
        // Implementation will depend on your chosen storage format (file, database, etc.)
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        students.add(new Student(name, age));
        System.out.println("Student added!");
    }

    private static void editStudent(Scanner scanner) {
        // Implement editing student details
    }

    private static void searchStudent(Scanner scanner) {
        // Implement searching for a student
    }

    private static void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}