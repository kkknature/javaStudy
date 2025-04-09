package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class ZipcodeEx03 {
    public static void main(String[] args) {

        // ZipcodeExample 풀이 (버전2) -> PreparedStatmemt로 변경해 작성

        // 파일을 읽어서 insert 문 생성
        // 데이터베이스 연결 후 insert 실행

        String url = "jdbc:mysql://localhost:3306/project";
        String user = "project";
        String password = "123456";

        BufferedReader br = null;

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "insert into zipcode values (?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            String line = "";
            while( ( line = br.readLine() ) != null ) {

                String[] address = line.split(",");

                pstmt.setString(1, address[0]);
                pstmt.setString(2, address[1]);
                pstmt.setString(3, address[2]);
                pstmt.setString(4, address[3]);
                pstmt.setString(5, address[4]);
                pstmt.setString(6, address[5]);
                pstmt.setString(7, address[6]);

                pstmt.executeUpdate();

            }

            System.out.println("저장 완료");

        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (SQLException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { }
            if (conn != null) try { conn.close(); } catch (SQLException e) {}

            if ( br != null ) try { br.close(); } catch ( IOException e ) {}
        }
    }
}
