public class ArrayEx07 {
    public static void main(String[] args) {
        
        int[][] arrs = { {10, 20}, {30, 40}, {50, 60}};

        // 전체
        // [[I@24d46ca6
        System.out.println(arrs);
        // 행
        // [I@4517d9a3
        System.out.println(arrs[0]);
        //실제 데이터
        System.out.println(arrs[0][0]);

        // 배열의 길이 : 행의 갯수
        System.out.println(arrs.length);
        // 열의 갯수
        System.out.println(arrs[0].length);

        // 전체 데이터 : for
        for(int row = 0; row < arrs.length; row++) {
            for(int col = 0; col < arrs[row].length; col++) {
                System.out.println(arrs[row][col]);
            }
        }

        for(int[] cols : arrs) {
            for(int data : cols) {
                System.out.println(data);
            }
        }


        String[][] arrs2 = { {"aa", "bb", "cc"}, {"dd", "ee", "ff"}, {"gg", "hh", "ii"} };

        // 전체 데이터 - 일반 for 문 / 향상된 for 문으로 출력

        for(int i = 0; i < arrs2.length; i++) {
            for(int j = 0; j < arrs2[i].length; j++) {
                System.out.println(arrs2[i][j]);
            }
        }

        for(String[] cols : arrs2) {
            for(String data : cols) {
                System.out.println("데이터 : " + data);
            }
        }

    }
}