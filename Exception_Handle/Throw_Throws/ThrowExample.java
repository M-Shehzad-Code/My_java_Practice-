package Throw_Throws;

public class ThrowExample {
    public static void main(String[] args) {
        
        int age = 16;

        try {

            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            }

            System.out.println("You are eligible");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("Program completed");
    }
}
