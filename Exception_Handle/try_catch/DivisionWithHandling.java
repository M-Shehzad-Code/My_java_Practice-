package try_catch;

public class DivisionWithHandling {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            int result = a/b ;
            System.out.println("Result:"+ result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number canot be divide by 0");
        }
        System.out.println("Program completed");
    }
}
