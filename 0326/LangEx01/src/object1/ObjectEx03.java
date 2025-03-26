package object1;

public class ObjectEx03 {
    public static void main(String[] args) {

        // 비교
        int a1 = 10;
        int a2 = 10;

        // 값에 대한 비교
        System.out.println(a1 == a2);

        Object o1 = new Object();
        Object o2 = new Object();

        // 주소를 비교
        System.out.println(o1);
        System.out.println(o2);
        // 주소를 비교
        System.out.println(o1 == o2);
        // 멤버필드 값을 비교
        System.out.println(o1.equals(o2));

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        // 멤버필드 값
        System.out.println(s1.equals(s2));
    }
}
