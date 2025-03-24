public class IfEx10 {
    public static void main(String[] args) {
        
        // 단순 조건

        // 들여쓰기 조심
        if(10 > 3) {
            System.out.println("참일 때 처리");
        } else {
            System.out.println("거짓일 때 처리");
        }

        //(10 > 3) ? System.out.println("참일 때 처리") : System.out.println("거짓일 때 처리");
        char c = (10 > 3) ? 'T' : 'F';
        System.out.println(c + "일 때 처리");
    }
}
