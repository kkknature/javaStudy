public class ExceptionEx06 {
    public static void main(String[] args) {

        System.out.println("시작");

        try {
            int[] datas = {0, 2, 10};

            int result = datas[2] / datas[1];
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        // if ~ else ~
        } catch (Exception e) {
        //} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("끝");
    }
}
