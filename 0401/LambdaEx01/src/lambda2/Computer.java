package lambda2;

public class Computer {

    public static double staticCalc(double x, double y) {
        return x + y;
    }

    public double instanceCalc(double x, double y) {
        return x * y;
    }
}
