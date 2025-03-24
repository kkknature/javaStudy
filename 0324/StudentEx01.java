// 새로운 클래스 선언
class Student {
    String hakbun;
	String name;
	int age;
	double height;
	double weight;

}

public class StudentEx01 {
    public static void main(String[] args) {

        // 인스턴스화 (객체변수를 만드는 과정)

        // 변수선언
        int a;

        // 객체변수 선언
        Student stu1;
        // 객체(참조)변수 생성
        // new : 메모리 생성 연산자
        stu1 = new Student();

        // 참조변수의 초기화
        // . : 메모리 참조 연산자
        stu1.hakbun = "1001";
        stu1.name = "홍길동";
        stu1.age = 20;
        stu1.height = 180.5;
        stu1.weight = 80.0;

        System.out.println(stu1.hakbun);
        System.out.println(stu1.name);
        System.out.println(stu1.age);

        Student stu2 = new Student();

        stu2.hakbun = "1002";
        stu2.name = "박문수";
        stu2.age = 22;
        stu2.height = 170.0;
        stu2.weight = 75.0;

        System.out.println(stu2.hakbun);
        System.out.println(stu2.name);
        System.out.println(stu2.age);

    }
}
