public class ArrayEx01 {
    public static void main(String[] args) {
        
        // 1. 배열 선언
        int[] arr1;
        int arr2[];

        // 2. 배열의 생성
        arr1 = new int[5];

        // 3. 초기화 - 처음 값을 입력
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        // 실행시에 에러 발생
        //arr1[5] = 6;

        // 내용
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

        // 실행시에 에러 발생
        //System.out.println(arr1[5]);

    }
}
