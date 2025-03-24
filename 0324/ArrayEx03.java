public class ArrayEx03 {
    public static void main(String[] args) {
        
        int[] arr1 = {10};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {10, 20, 30, 40, 50};

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        // 배열 내용 확인 - 반복문

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);

        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // 향상된 for
        for(int data : arr3) {
            System.out.println(data);
        }
    }
}
