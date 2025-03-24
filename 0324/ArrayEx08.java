public class ArrayEx08 {
    public static void main(String[] args) {
        
        // 가변배열
        int[][] arrs1 = {{10, 20, 30}, {40, 50}, {60}};

        int[][] arrs2 = new int[4][];
        arrs2[0] = new int[3];
        arrs2[1] = new int[2];
        arrs2[2] = new int[1];

        // arrs1의 데이터 출력(for)
        for(int i = 0; i < arrs1.length; i++) {
            for(int j = 0; j < arrs1[i].length; j++) {
                System.out.println(arrs1[i][j]);
            }
        }
    }
}
