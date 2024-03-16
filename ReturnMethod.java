
public class ReturnMethod {

    // Method with int return type
    public static int calculate(int num1, int num2) {
        return num1 + num2;
    }

    // Method with double return type
    public static double calculate(double num1, double num2) {
        return (double)(num1 + num2);
    }

    // Main method
    public static void main(String[] args) {
        int sumInt = calculate(5, 3); // Calls the method returning int
        double sumDouble = calculate(5, 3); // Calls the method returning double
        
        System.out.println("Sum (int): " + sumInt);
        System.out.println("Sum (double): " + sumDouble);
    }
}

