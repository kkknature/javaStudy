package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZipcodeEx01 {
    public static void main(String[] args) {

        // ZipcodeExample 풀이 (버전1)

        // 파일을 읽어서 insert 문 생성
        // 데이터베이스 연결 후 insert 실행

        BufferedReader br = null;

        try {
            br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );

            String line = "";
            while( ( line = br.readLine() ) != null ) {
                // System.out.println( line );

                String[] address = line.split(",");
                String sql = String.format( "insert into zipcode values ( '%s', '%s', '%s', '%s', '%s', '%s', %s)",
                        address[0], address[1], address[2], address[3], address[4], address[5], address[6] );

                System.out.println( sql );
            }

        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }
    }
}
