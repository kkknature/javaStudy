class Variable {
    String instanceVariable;
    static String classVariable;
}

public class VariableEx01 {
    public static void main(String[] args) {
        //Variable v1 = new Variable();
        //v1.instanceVariable = "10";
        //v1.classVariable = "20";

        // 인스턴스 멤버 : 객체변수화 해야지 사용가능
        //System.out.println(v1.instanceVariable);
        //System.out.println(v1.classVariable);

        
        Variable.classVariable = "30";
        // 정적 멤버 : 클래스 이름만으로도 사용가능
        System.out.println(Variable.classVariable);
    }
}
