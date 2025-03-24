public class DataTypeEx02 {
    public static void main(String[] args) {

        // 문자(한글자) : char

        //char c1 = a;
        char c1 = 'a';
        System.out.println( c1 );

        char c2 = '한';
        System.out.println( c2 );

        // 2 글자 이상이면 문자열
        //char c3 = '한글';
        //System.out.println( c3 );

        // 문자열
        String str1 = "문자열";
        System.out.println( str1 );

        // 모든 문자(영문, 특수문자, 숫자) - 내부적으로는 ascii 코드로 저장
        char c3 = 97;
        System.out.println( c3 );

        // https://ko.wikipedia.org/wiki/ASCII
        char c4 = 97 + 1;
        System.out.println( c4 );

        // 다국어 : 유니코드
        char c5 = '\uC790';
        System.out.println( c5 );


    }
}
