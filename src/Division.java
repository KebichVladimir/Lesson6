import java.util.Scanner;

public class Division implements Operations {
    @Override
    public void getOperation() throws DivisionByZero {
        System.out.println("ДЕЛЕНИЕ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        Value division = new Value(scanner.nextDouble(), scanner.nextDouble());
        double calculationDivision = division.getA() / division.getB();
        if (division.getB() == 0) throw new DivisionByZero("Деление на ноль");
        System.out.println(calculationDivision);
    }
}