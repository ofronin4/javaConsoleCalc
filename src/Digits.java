import java.util.Scanner;

public class Digits {
    protected double firstDigit;
    protected double secondDigit;

    public void Digits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first digit:");
        firstDigit = scanner.nextDouble();
        System.out.print("Enter second digit:");
        secondDigit = scanner.nextDouble();


    }

}


