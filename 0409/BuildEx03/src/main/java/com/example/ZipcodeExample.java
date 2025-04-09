package com.example;

import java.io.*;
import java.sql.*;

public class ZipcodeExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/project";
        String user = "project";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String line = null;
            while((line = br.readLine()) != null) {
                String[] address = line.split(",");
                String data = String.format("insert into zipcode values ('%s', '%s', '%s', '%s', '%s', '%s', %s)",
                        address[0], address[1], address[2], address[3], address[4], address[5], address[6]);

                stmt.executeUpdate(data);

                //System.out.println(data);
            }

            System.out.println("데이터 입력 성공");

        } catch (ClassNotFoundException e) {
            System.out.println("[에러]: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}

            if (br != null) try { br.close(); } catch ( IOException e) {}
        }
    }
}
