import java.util.Scanner;

import static java.lang.Math.*;

public class MathSqrt implements Operations {
    @Override
    public void getOperation() throws NegativeNumber {
        System.out.println("КОРЕНЬ ИЗ ЧИСЛА");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        Value number = new Value(scanner.nextDouble());
        double sqrt = sqrt(number.getA());
        if (number.getA() < 0) throw new NegativeNumber("Корень из отрицательного числа");
        System.out.println(sqrt);
    }
}