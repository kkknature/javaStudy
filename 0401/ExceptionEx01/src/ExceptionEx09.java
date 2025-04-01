public class ExceptionEx09 {

    // throws - 메소드 선언

    public void method1(int num) {
        System.out.println("시작");

        // num 값에 대한 검사
        if (num >= 100) {
            System.out.println("정상 입력");
        } else {
            System.out.println("비정상 입력");
        }

        System.out.println("끝");
    }

    public void method2(int num) {
        System.out.println("시작");

        try {
            if (num >= 100) {
                System.out.println("정상");
            } else {
                throw new Exception("100이상 입력해 주세요");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("끝");
    }

    // 메소드 에러처리 : 선언 -> 실행시 위임
    public void method3(int num) throws Exception {
        System.out.println("시작");

        if (num >= 100) {
            System.out.println("정상");
        } else {
            throw new Exception("100이상 입력해 주세요");
        }
        System.out.println("끝");
    }

    public static void main(String[] args) {

        ExceptionEx09 ex = new ExceptionEx09();
        ex.method2(10);
        ex.method2(100);

        try {
            //ex.method3(10);
            ex.method3(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
