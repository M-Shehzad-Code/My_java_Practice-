class Student1 {

    String name;
    int age;
    double cgpa;

    Student1(String n, int a, double c) {

        name = n;
        age = a;
        cgpa = c;
    }

    void showStudent() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}

class BSStudent extends Student1 {

    int semester;

    BSStudent(String n, int a, double c, int s) {

        super(n, a, c);

        semester = s;
    }

    void showBSStudent() {

        super.showStudent();

        System.out.println("Semester: " + semester);
    }
}

public class inher2 {

    public static void main(String[] args) {

        BSStudent s = new BSStudent(
            "Shahzad",
            22,
            3.34,
            5
        );

        s.showBSStudent();
    }
}