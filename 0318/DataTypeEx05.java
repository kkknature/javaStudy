public class DataTypeEx05 {
    public static void main(String[] args) {
        
        // 정수형

        int i = 1;
        System.out.println( i );

        byte b = 1;
        short s = 1;

        long l = 1;
        long l2 = 1L;
        System.out.println( b );
        System.out.println( s );
        System.out.println( l );
        System.out.println( l2 );

        // 진수(2, 8, 16)

        int i2 = 0b1010;
        int i8 = 030;
        int i16 = 0xA4;
        System.out.println( i2 );
        System.out.println( i8 );
        System.out.println( i16 );

        long test = 3000000000L;
        System.out.println( test );

    }
}
