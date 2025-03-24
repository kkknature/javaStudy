public class ArrayEx05 {
    public static void main(String[] args) {
        
        // 기본 자료형
        int a1 = 10;
        int a2 = a1;

        System.out.println("a1 : " + a1);
        System.out.println("a2 : " + a2);

        a2 = 20;
        
        System.out.println("a1 : " + a1);
        System.out.println("a2 : " + a2);

        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;

        // [I@38af3868 : 참조값(주소값)
        System.out.println("arr1 : " + arr1);
        System.out.println("arr2 : " + arr2);

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr2[0] = 100;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

    }
}
