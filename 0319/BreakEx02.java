public class BreakEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        int i = 1;
        outer:          // 라벨
        while(i <= 4) {
            i++;

            int j = 1;
            while(j <= 4){
                j++;


                if(j == 4) {
                    //break outer;
                    continue outer;
                }
                System.out.println(i + " / " + j);
            }
        }

        System.out.println("끝");
    }
}
