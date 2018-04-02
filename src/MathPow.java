import java.util.Scanner;

import static java.lang.Math.*;

public class MathPow implements Operations {
    @Override
    public void getOperation() throws MathPowZero {
        System.out.println("ВОЗВЕДЕНИЕ В СТЕПЕНЬ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        Value number = new Value(scanner.nextDouble());
        System.out.println("Введите степень");
        Value power = new Value(scanner.nextDouble());
        double calculationPow = pow(number.getA(), power.getA());
        if (number.getA() == 0) throw new MathPowZero("Возведение нуля в степень");
        System.out.println(calculationPow);
    }
}