public class IfEx04 {
    public static void main(String[] args) {
        
        System.out.println("시작");

        int hour = 8;

        if(hour <= 12) {
            // 12시 전
            if(hour <= 9) {
                // 9시 전
                System.out.println("아침");
            } else {
                System.out.println("아점");
            }
        } else {
            // 12시 후
            if(hour <= 15) {
                System.out.println("점심");
            } else {
                System.out.println("점저");
            }
        }

        System.out.println("끝");
    }
}
