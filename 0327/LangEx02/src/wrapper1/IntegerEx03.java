package wrapper1;

public class IntegerEx03 {
    public static void main(String[] args) {

        // 문자열 -> 기본자료형
        Integer i1 = Integer.valueOf("10");
        // *중요* (굉장히 많이 씀)
        int i2 = Integer.parseInt("10");

        Float f1 = Float.valueOf("10.0");
        float f2 = Float.parseFloat("10.0");    // *중요*

        System.out.println(i2);
        System.out.println(f2);


        // 기본자료형 -> 문자형
        String str1 = i1.toString();
        String str2 = f1.toString();

        System.out.println(str1);
        System.out.println(str2);
    }
}
