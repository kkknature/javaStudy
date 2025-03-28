package string1;

public class StringEx03 {
    public static void main(String[] args) {

        String str1 = "Hello String Hello String";

        // indexOf - 문자나 문자열 위치 검색(앞부터)
        // lastIndexOf - 뒤부터 문자열 위치 검색

        // 문자나 문자열 존재(true/false)
        // startsWith / endsWith / contains
        boolean b1 = str1.startsWith("he");
        System.out.println(b1);

        // 문자열 치환
        String rstr = str1.replaceAll("Hello", "안녕");
        System.out.println(rstr);

        // 문자열 결합: +
        String jstr = str1.concat(" 안녕");
        System.out.println(jstr);

        // 대소문자 변환
        System.out.println("hello".toUpperCase());
        System.out.println("HELLO".toLowerCase());

        // 공백제거(문자열 앞뒤의 공백)
        String ostr1 = "   Hello String   ";
        System.out.println(ostr1.length());
        String ostr2 = ostr1.trim();
        System.out.println(ostr2);
        System.out.println(ostr2.length());

        // 구분자(,) 중심의 문자열 분리
        // 문자열 -> 배열
        String sstr1 = "apple,banana,pineapple,kiwi";
        String[] strArr1 = sstr1.split(",");
        for(String str : strArr1) {
            System.out.println(str);
        }

        // 구분자 중심 문자열 결합
        // 배열 -> 문자열
        // join은 클래스 메소드
        String jstr1 = String.join(",", strArr1);
        System.out.println(jstr1);
        String jstr2 = String.format("%s,%s,%s,%s", strArr1[0], strArr1[1], strArr1[2], strArr1[3]);
        System.out.println(jstr2);
    }
}
