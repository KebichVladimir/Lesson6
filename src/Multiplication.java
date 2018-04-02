import java.util.Scanner;

public class Multiplication implements Operations {
    @Override
    public void getOperation() {
        System.out.println("УМНОЖЕНИЕ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        Value multiplication = new Value(scanner.nextDouble(), scanner.nextDouble());
        double calculationMultiplication = multiplication.getA() * multiplication.getB();
        System.out.println(calculationMultiplication);
    }
}