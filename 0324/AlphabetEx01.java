public class AlphabetEx01 {
    public static void main(String[] args) {
        // for (행) / for (열)

        // 10행        
        for(int i = 0; i <= 9; i++) {
            // 알파벳 열 출력
            for(int j = 65; j <= 65 + i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
