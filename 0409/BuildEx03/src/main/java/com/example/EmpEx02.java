package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class EmpEx02 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("./emp.sql"));

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String mgr = rs.getString("mgr");
                String hiredate = rs.getString("hiredate");
                String sal = rs.getString("sal");
                String comm = rs.getString("comm");
                String deptno = rs.getString("deptno");

                String data = String.format("insert into emp2 values (%s, '%s', '%s', %s, '%s', %s, %s, %s);",
                        empno, ename, job, mgr, hiredate, sal, comm, deptno);
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
