public class ArrayEx06 {
    public static void main(String[] args) {
        
        // 선언
        int[][] arr1;

        // 생성
        arr1 = new int[3][2];       // 3 x 2

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        // 선언, 생성, 초기화
        //int[][] arr2 = new int[][]{ {10, 20}, {30, 40}, {50, 60}};
        int[][] arr2 = new int[][] { {10, 20}, {30, 40}, {50, 60}};

        System.out.println(arr2[0][0]);
        System.out.println(arr2[2][1]);

    }
}
