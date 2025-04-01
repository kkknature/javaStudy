public class ExceptionEx07 {
    public static void main(String[] args) {

        System.out.println("시작");

        try {
            int[] datas = {0, 2, 10};

            int result = datas[2] / datas[0];
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            // 마무리 작업할 때 사용
            System.out.println("항상 실행");
        }

        System.out.println("끝");
    }
}
