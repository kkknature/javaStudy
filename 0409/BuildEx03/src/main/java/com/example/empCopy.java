package com.example;

import java.sql.*;

public class empCopy {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from emp";

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String mgr = rs.getString("mgr");
                String hiredate = rs.getString("hiredate");
                String sal = rs.getString("sal");
                String comm = rs.getString("comm");
                String deptno = rs.getString("deptno");

                //System.out.println(empno);

                String insert = "insert into emp2 values (?, ?, ?, ?, ?, ?, ?, ?)";

                pstmt2 = conn.prepareStatement(insert);
                pstmt2.setString(1, empno);
                pstmt2.setString(2, ename);
                pstmt2.setString(3, job);
                pstmt2.setString(4, mgr);
                pstmt2.setString(5, hiredate);
                pstmt2.setString(6, sal);
                pstmt2.setString(7, comm);
                pstmt2.setString(8, deptno);

                pstmt2.executeUpdate();
            }

            System.out.println("입력 완료");

        } catch (ClassNotFoundException e) {
            System.out.println("[에러]: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if(pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if(conn != null) try { conn.close(); } catch (SQLException e) {}
            if(rs != null) try { rs.close(); } catch (SQLException e) {}
        }

    }
}
