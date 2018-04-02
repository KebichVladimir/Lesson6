import java.util.Scanner;

public class Sum implements Operations {
    @Override
    public void getOperation() {
        System.out.println("СЛОЖЕНИЕ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        Value Sum = new Value(scanner.nextDouble(), scanner.nextDouble());
        double calculationSum = Sum.getA() + Sum.getB();
        System.out.println(calculationSum);
    }
}