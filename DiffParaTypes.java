
public class DiffParaTypes {

    // Method with one parameter of type int
    public static void display(int num) {
        System.out.println("The integer is: " + num);
    }

    // Method with one parameter of type double
    public static void display(double num) {
        System.out.println("The double is: " + num);
    }

    // Main method
    public static void main(String[] args) {
        // Calling the method with an integer parameter
        display(70);
        
        // Calling the method with a double parameter
        display(3.14);
    }
}

