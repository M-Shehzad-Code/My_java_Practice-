class Student{
    String name;
    int age;
    double cgpa;

    void displayStudentinfo(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("CGPA:" + cgpa);

    }
}

class BSstudent extends Student{

    int semester;

    void displaySemesterInfo(){
      System.out.println("Semester" + semester);
    }
}
class MSstudent extends Student {
     String specialization;

     void SpecilaizationInfo(){
        System.out.println("Specialization" + specialization);
     }
}

public class inhertiance1 {
    public static void main(String[] args) {
        BSstudent sstudent = new BSstudent();
        sstudent.name = "Shehzad";
        sstudent.age = 21;
        sstudent.cgpa = 3.4;
        sstudent.semester = 4;
        System.out.println("Bs Sudent:");
        sstudent.displayStudentinfo();
        sstudent.displaySemesterInfo();

        
        System.out.println("MS student:");
        MSstudent ms = new MSstudent();

        ms.name = "Ahmed";
        ms.age = 25;
        ms.cgpa = 3.70;
        ms.specialization = "Artificial Intelligence";

        System.out.println("MS Student:");

        ms.displayStudentinfo();
        ms.SpecilaizationInfo();
        

    }
}
