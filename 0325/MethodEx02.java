class Method {

    void doFunc1(String data1) {
        System.out.println("doFunc1(String data1)");
    }

    void doFunc2(String data1, String data2) {
        System.out.println("doFunc2(String data1, String data2)");
    }

    void doFunc(String ... data) {
        System.out.println("doFunc(String ... data)");

        System.out.println(data.length);
        for(String d : data) {
            System.out.println(d);
        }
    }
}

public class MethodEx02 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc1("data1");
        m.doFunc2("data1", "data2");

        m.doFunc("data1");
        m.doFunc("data1", "data2");
    }
}
