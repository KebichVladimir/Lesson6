import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisionByZero, NegativeNumber, MathPowZero {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("КАЛЬКУЛЯТОР");
            System.out.println("Выберите операцию:\n1-сложение \n2-вычетание \n3-умножение \n4-деление \n5-возведение в степень \n6-корень из числа");
            int answer = scanner.nextInt();
            Sum sum = new Sum();
            Operations subtraction = new Subtraction();
            Operations multiplication = new Multiplication();
            Operations division = new Division();
            Operations mathPow = new MathPow();
            Operations mathSqrt = new MathSqrt();
            switch (answer) {
                case 1:
                    sum.getOperation();
                    break;
                case 2:
                    subtraction.getOperation();
                    break;
                case 3:
                    multiplication.getOperation();
                    break;
                case 4:
                    division.getOperation();
                    break;
                case 5:
                    mathPow.getOperation();
                    break;
                case 6:
                    mathSqrt.getOperation();
                    break;
                default:
                    System.out.println("Такой операции нет");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Такой операции нет");
        }
    }
}