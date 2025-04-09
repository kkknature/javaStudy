package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class DeptEx01 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("./dept.csv"));

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "select deptno, dname, loc from dept";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String deptno = rs.getString("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");

                String data = String.format("%s,'%s','%s'", deptno, dname, loc);
                //System.out.println(data);

                bw.write(data + System.lineSeparator());
            }

            System.out.println("출력 성공");

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

            if (bw != null) try { bw.close(); } catch ( IOException e) {}
        }
    }
}
