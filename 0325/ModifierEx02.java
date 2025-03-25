class Student {
    
    private String name;

    // setter
    public void setName(String name) {

        // 무결성 체크
        if(!name.equals("")){
            this.name = name;
        } else {
            this.name = "아무나";
        }
    }

    // getter
    public String getName() {
        return name;
    }

}

public class ModifierEx02 {
    public static void main(String[] args) {
        Student s = new Student();
        //s.name = "홍길동";

        s.setName("홍길동");
        System.out.println(s.getName());

        s.setName("");
        System.out.println(s.getName());
    }
}
