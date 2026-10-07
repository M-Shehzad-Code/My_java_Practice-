// // Example1 of abstraction:
// abstract class Student {
//     String name;
//     int rollNo;
//     double cgpa;
//     abstract void displayResult();
// }
// class UniversityStudent extends Student {
//         void displayResult(){
         
//         System.out.println("Name: " + name);
//         System.out.println("RollNo: " + rollNo);
//         System.out.println("CGPA: " + cgpa);
//         }

// }

// // public class abstr1 {
//     public static void main(String[] args) {
//           UniversityStudent s = new UniversityStudent();

//         s.name = "Shahzad";
//         s.rollNo = 22;
//         s.cgpa = 3.34;

//         s.displayResult();

//     }
// }


//Example 2 of abstraction:
abstract class Ustudent{
    String name;
    int rollNo;
    double cgpa;
    public void displayInfo(){

        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("CGPA: " + cgpa);
    
    }
    abstract void calculateResult();
}
class myUniversit extends Ustudent{
    
    void calculateResult() {
        
        if (cgpa >= 2.0) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
        
    }
}
public class abstr1{
    public static void main(String[] args) {
        myUniversit s = new myUniversit();

        s.name = "Shahzad";
        s.rollNo = 22;
        s.cgpa = 3.34;

        s.displayInfo();
        s.calculateResult();
    }
}