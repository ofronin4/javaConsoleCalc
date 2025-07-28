import java.util.Scanner;

public class ArithmeticOperations extends Digits {
    private String result;
    private String operation;
    Scanner scanner = new Scanner(System.in);

    public ArithmeticOperations() {
        super();
        System.out.println("Choose Arithmetic operation:\n1) Plus (+) \n2) Minus (-)\n3) Multiply (*)\n4) Divide (/)");
        operation = scanner.nextLine();

        switch (operation) {
            case "1":
            case "+":
            case "Plus":
            case "plus":
                this.operation = "Summarizing";
                plus();
                break;
            case "2":
            case "-":
            case "Minus":
            case "minus":
                this.operation = "Subtraction";
                minus();
                break;
            case "3":
            case "*":
            case "Multiply":
            case "multiply":
                this.operation = "Multiplication";
                multiply();
                break;
            case "4":
            case "/":
            case "Divide":
            case "divide":
                this.operation = "Division";

                divide();
                break;
            default:
                result = "Invalid operation.";
        }
    }


    // Operations
    public void plus() {
        result = String.valueOf(firstDigit + secondDigit);
        Result();
    }

    public void minus() {
        result = String.valueOf(firstDigit - secondDigit);
        Result();

    }

    public void multiply() {
        result = String.valueOf(firstDigit * secondDigit);
        Result();
    }

    public void divide() {
        if (secondDigit != 0) {
            result = String.valueOf(firstDigit / secondDigit);
        } else {
            result = "Error: division by zero.";
        }
        Result();
    }
    public void Result() {
        System.out.println("Result of " + operation + " of " + firstDigit + " and " + secondDigit + " is " + result +".");
    }


}