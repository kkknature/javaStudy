public class BreakEx01 {
    public static void main(String[] args) {
        System.out.println("시작");

        int i = 0;
        while(i <=4) {
            i++;
            if(i == 3) {
                // 강제종료
                //break;

                continue;
            }
            System.out.println(i);
        }

        System.out.println("끝");
    }
}
