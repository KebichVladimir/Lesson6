public class Value {
    private double a;
    private double b;

    Value(double a, double b) {
        this.a = a;
        this.b = b;
    }

    Value(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}