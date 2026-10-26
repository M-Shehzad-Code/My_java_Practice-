class Student {

    void displayStudent() {
        System.out.println("Student");
    }
}

class CSStudent extends Student {

    void displayStudent() {
        System.out.println("Computer Science Student");
    }
}

class AIStudent extends Student {

    void displayStudent() {
        System.out.println("Artificial Intelligence Student");
    }
}
public class PolyPrac {
    public static void main(String[] args) {
        

        Student student1 = new CSStudent();
        Student student2 = new AIStudent();

        student1.displayStudent();
        student2.displayStudent();
    }
}

    
