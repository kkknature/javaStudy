package wrapper1;

public class IntegerEx04 {
    public static void main(String[] args) {

        // 오토박싱
        // 기본 자료형 => 객체 (매서드 거치지 않고 바로)
        Integer i1 = Integer.valueOf(1);
        Integer i2 = 2;

        // 언박싱 (오토박스 반대)
        int i3 = i1;

        int sum = i1 + 20;
        System.out.println(sum);

        Integer i4 = Integer.valueOf(4);

        int sum1 = i4 + i1;
        System.out.println(sum1);

        // 오토박싱과 언박싱을 거치면 마치 일반 자료형인 것 처럼 취급할 수 있다.

        // 숫자 공유
        Integer i11 = Integer.valueOf(11);
        Integer i12 = Integer.valueOf(11);

        System.out.println(i11 == i12);

        // 다른 장소에 저장(X)
        Integer i21 = new Integer(11);
        Integer i22 = new Integer(11);

        System.out.println(i21 == i22);
    }
}
