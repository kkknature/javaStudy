class Student {
    // 멤버필드(변수)
    String hakbun;
	String name;
	int age;
	double height;
	double weight;

    // 메서드
    void doStudy() {
        System.out.println("공부하기");
    }

    void doLunch() {
        System.out.println("점심먹기");
    }

}

public class StudentEx02 {
    public static void main(String[] args) {
        
        Student stu1 = new Student();
        stu1.hakbun = "1001";
        stu1.name = "홍길동";
        
        stu1.doStudy();
        System.out.println(stu1.hakbun);
        System.out.println(stu1.name);

        // 참조값 출력됨 : Student@4517d9a3
        System.out.println(stu1);


        Student stu2 = new Student();
        stu1.hakbun = "1002";
        stu1.name = "박문수";
        System.out.println(stu2);
        System.out.println(stu2.hakbun);
        System.out.println(stu2.name);

    }
}
