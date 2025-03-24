public class OperatorEx03 {
    public static void main(String[] args) {
        
        int i1 = 1000000;
        System.out.println( i1 );

        int i2 = 1_000_000;
        System.out.println( i2 );

        // 오버플로우우
        int product = i1 * i2;
        // 산술연산자
        // int (기본) < 
        // 연산 하나를 큰 자료로 하면 큰 자료를 따라감
        long product2 = i1 * i2;
        long product3 = (long)i1 * i2;
        System.out.println( product );
        System.out.println( product2 );
        System.out.println( product3 );

        int i11 = 10;
        int i12 = 20;
        int sum1 = i11 + i12;
        System.out.println( sum1 );

        short s1 = 10;
        short s2 = 20;
        int sum2 = s1 + s2;
        System.out.println( sum2 );
    }
}
