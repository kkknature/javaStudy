package com.example;

import java.sql.*;
import java.util.Scanner;

public class EnameSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("사원이름 : ");
        String name = scanner.nextLine();
        scanner.close();

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "select e.empno, e.ename, e.sal, e.sal * 12 + ifnull(e.comm, 0) annsal, e.hiredate, " +
                    "d.dname, d.loc from dept d inner join emp e on (d.deptno = e.deptno) where e.ename = ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name );

            rs = pstmt.executeQuery();

            while(rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                String annsal = rs.getString("annsal");
                String hiredate = rs.getString("hiredate");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                String emp = String.format("%s %s %s %s %s %s %s",
                        empno, ename, sal, annsal, hiredate, dname, loc);

                System.out.println(emp);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { }
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { }
            if (conn != null) try { conn.close(); } catch (SQLException e) { }
        }
    }
}
