class Constructor {
    // 생성자 선언이 없으면 자동생성
    // 생성자명은 클래스명과 동일
    // 리턴 형태가 없음
    // 디폴트 생성자(기본 생성자)
    // Constructor() {}

    // 멤버필드의 초기화 기능
    Constructor() {
        System.out.println("Constructor() 호출");
    }
}

public class ConstructorEx01 {
    public static void main(String[] args) {

        // new + 생성자
        Constructor c =new Constructor();
    }
}
