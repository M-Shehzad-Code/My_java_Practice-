class Student {

    String name;
    int age;
    double cgpa;

    void displayStudent() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}

class AIStudent extends Student {

    void displayStudent() {

        super.displayStudent();

        System.out.println("Specialization: Artificial Intelligence");
    }
}

public class InherSuper {
public static void main(String[] args) {
AIStudent student = new AIStudent();

student.name = "Ahmed";
student.age = 22;
student.cgpa = 3.7;

student.displayStudent();
}
    
}