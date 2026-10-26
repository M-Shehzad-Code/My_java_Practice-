abstract class Student {

    String name;
    int age;
    double cgpa;

    // Constructor of abstract class
    Student(String n, int a, double c) {

        name = n;
        age = a;
        cgpa = c;

        System.out.println("Student constructor called");
    }

    // Abstract method
    abstract void displayResult();

    // Normal method
    void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}


class UniversityStudent extends Student {

    // Child constructor
    UniversityStudent(String n, int a, double c) {

        // Calling parent constructor
        super(n, a, c);

        System.out.println("UniversityStudent constructor called");
    }

    // Implementing abstract method
    void displayResult() {

        if (cgpa >= 2.0) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }
}


public class abs3 {

    public static void main(String[] args) {

        UniversityStudent s =
                new UniversityStudent("Shahzad", 22, 3.34);

        System.out.println();

        s.displayInfo();

        s.displayResult();
    }
}