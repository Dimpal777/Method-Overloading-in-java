
public class OverloadingMethod {

    // Method with one parameter of type int
    public static void display(int num) {
        System.out.println("The number is: " + num);
    }

    // Method with two parameters, one of type String and one of type int
    public static void display(String message, int num) {
        System.out.println(message + ": " + num);
    }

    // Main method
    public static void main(String[] args) {
        // Calling the method with one parameter
        display(10);
        
        // Calling the method with two parameters
        display("The number is", 20);
    }
}

