abstract class Mystudents{
    String name;
    int rollNo;
    double cgpa;

    void showInfo(){
        System.out.println("Name:" + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("CGPA:" + cgpa);

    }
    abstract void calculateResult();
}
class regularStudent extends Mystudents{
    void  calculateResult(){
        if(cgpa >= 2){
            System.out.println("Student is pass");
        }
        else{
            System.out.println("\"Student failed");
        }
    }
}
class ResearchStudent extends Mystudents {

    boolean researchCompleted;

    void calculateResult() {

        if (cgpa >= 2.0 && researchCompleted == true) {
            System.out.println("Research Student Passed");
        } else {
            System.out.println("Research Student Failed");
        }
    }
}


public class abst2 {
    public static void main(String[] args) {
         regularStudent s1 = new regularStudent();

        s1.name = "Ali";
        s1.rollNo = 22;
        s1.cgpa = 3.2;

        s1.showInfo();
        s1.calculateResult();


        System.out.println();


        ResearchStudent s2 = new ResearchStudent();

        s2.name = "Ahmed";
        s2.rollNo = 24;
        s2.cgpa = 3.5;
        s2.researchCompleted = true;

        s2.showInfo();
        s2.calculateResult();
    }
    }
