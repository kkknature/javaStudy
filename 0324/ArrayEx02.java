public class ArrayEx02 {
    public static void main(String[] args) {
        
        // 선언과 생성
        int[] arr1 = new int[5];

        // 초기화
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        // 선언, 생성, 초기화
        //int[] arr2 = new int[] {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);

        // 값의 변경
        arr2[0] = 100;
        arr2[1] = 200;
        
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
