class Constructor {
    // 생성자 오버로딩

    Constructor() {
        this("임꺽정");
        System.out.println("Constructor() 호출");
        // 생성자는 이름을 통해서 호출 불가능
        //this.Constructor("박문수");
        //this();
    }

    Constructor(String data) {
        System.out.println("Constructor(String data) 호출");
    }
}

public class ConstructorEx03 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        //Constructor c2 = new Constructor("홍길동");
        

    }
}
