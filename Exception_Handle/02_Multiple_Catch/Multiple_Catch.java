

public class Multiple_Catch {
    public static void main(String[] args) {
        String name = "abc";
        int[] number = {3,4,5};
        try {
            
            int num = Integer.parseInt(name);
            System.out.println("Number" + num);

            System.out.println("Array value" + number[1]);

            int result = 10/2;
            System.out.println("Division Result" + result);


        } 
          catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program completed.");
    }
    }

