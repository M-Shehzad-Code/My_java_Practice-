import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
       
   Scanner input = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        System.out.print("Enter attendence");
        double attendence = input.nextDouble();

        if (marks >=50 && attendence >= 70) {
            System.out.println("Eligble");
        } else {
            System.out.println("Not eligible");
        }
        input.close();
        
}
}