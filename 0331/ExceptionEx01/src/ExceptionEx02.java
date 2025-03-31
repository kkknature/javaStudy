public class ExceptionEx02 {
    public static void main(String[] args) {

        System.out.println("시작");

        String[] datas = {"1", "2", "3"};

        // ArrayIndexOutOfBoundsException
        try {
            System.out.println(datas[1]);
            System.out.println(datas[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 발생: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("끝");
    }
}
