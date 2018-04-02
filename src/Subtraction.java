import java.util.Scanner;

public class Subtraction implements Operations {
    @Override
    public void getOperation() {
        System.out.println("ВЫЧЕТАНИЕ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        Value subtraction = new Value(scanner.nextDouble(), scanner.nextDouble());
        double calculationSubtraction = subtraction.getA() - subtraction.getB();
        System.out.println(calculationSubtraction);
    }
}