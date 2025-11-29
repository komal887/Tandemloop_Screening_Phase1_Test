import java.util.*;

class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.println("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.println("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.println("Select the type of operation (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Switch for operation
        switch (op) {
            case "+":
                result = a + b;
                System.out.println("Addition= " + result);
                break;

            case "-":
                result = a - b;
                System.out.println("Subtraction=" + result);
                break;

            case "*":
                result = a * b;
                System.out.println("Multiplication=" + result);
                break;

            case "/":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division=" + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }
    }
}
