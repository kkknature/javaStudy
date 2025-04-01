package lambda1;

public class LambdaExample2 {
    public static void main(String[] args) {

        Person2 person = new Person2();

        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        person.action((x, y) -> (x + y));

        person.action((x, y) -> sum(x, y));

    }

    public static double sum(double x, double y) {
        return x + y;
    }
}
