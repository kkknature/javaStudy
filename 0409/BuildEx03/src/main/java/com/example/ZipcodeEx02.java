package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ZipcodeEx02 {
    public static void main(String[] args) {

        // ZipcodeExample 풀이 (버전2)

        // 파일을 읽어서 insert 문 생성
        // 데이터베이스 연결 후 insert 실행

        String url = "jdbc:mysql://localhost:3306/project";
        String user = "project";
        String password = "123456";

        BufferedReader br = null;

        Connection conn = null;
        Statement stmt = null;

        try {
            br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();

            String line = "";
            while( ( line = br.readLine() ) != null ) {

                String[] address = line.split(",");
                String sql = String.format( "insert into zipcode values ( '%s', '%s', '%s', '%s', '%s', '%s', %s)",
                        address[0], address[1], address[2], address[3], address[4], address[5], address[6] );

                //System.out.println( sql );
                stmt.executeUpdate(sql);
            }

            System.out.println("저장 완료");

        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (SQLException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}

            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }
    }
}
