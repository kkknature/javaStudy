public class ExceptionEx03 {
    public static void main(String[] args) {

        System.out.println("시작");

        int num1 = 10;
        int num2 = 2;
        //int num2 = 0;

        // ArithmeticException
        System.out.println("1");
        try {
            System.out.println("2");
            int result = num1 / num2;
            System.out.println("3");
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("4");
        }
        System.out.println("5");

        System.out.println("끝");
    }
}
