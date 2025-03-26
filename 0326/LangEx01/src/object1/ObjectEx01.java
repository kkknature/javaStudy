package object1;

public class ObjectEx01 {
    public static void main(String[] args) {

        // Object 클래스 생성
        Object o = new Object();
        // java.lang.Object@41629346
        // 패키지.클래스명@해시코드 : 참조주소
        System.out.println(o);
        System.out.println(o.toString());

        System.out.println(o.getClass().getName());
        // 16진수로 변환해보세요..
        System.out.println(o.hashCode());

        //Person p = new Person();
        //System.out.println(p);
        // Object 클래스의 toString()
        //System.out.println(p.toString());

        //Object o1 = new Person();
       //System.out.println(o1.toString());
    }
}
