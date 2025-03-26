package object1;

public class ObjectEx02 {
    public static void main(String[] args) {
        String s = new String("Hello World");
        System.out.println(s);
        // toString - Object : 주소
        //            String : 내부문자열 출력되도록 오버라이딩
        System.out.println(s.toString());

        Person p = new Person("홍길동", 20);
        System.out.println(p.toString());
    }
}
