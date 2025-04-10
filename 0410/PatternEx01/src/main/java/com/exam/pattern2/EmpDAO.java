package com.exam.pattern2;

import java.sql.*;
import java.util.ArrayList;

public class EmpDAO {

    // 1. 데이터베이스 접속 - 생성자
    // 2. CRUD - 각 메서드 생성

    private Connection conn;

    public EmpDAO() {
        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        }
    }

    public ArrayList<EmpTO> selectEmp(String strEname) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        ArrayList<EmpTO> lists = new ArrayList<>();

        try {
            String sql = "select empno, ename, job, sal * 12 + ifnull(comm, 0) annsal, hiredate, deptno from emp where ename like ?";
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1, strEname + "%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                /*
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String annsal = rs.getString("annsal");
                String hiredate = rs.getString("hiredate");
                String deptno = rs.getString("deptno");
                 */

                EmpTO to = new EmpTO();
                to.setEmpno(rs.getString("empno"));
                to.setEname(rs.getString("ename"));
                to.setJob(rs.getString("job"));
                to.setAnnsal(rs.getString("annsal"));
                to.setHiredate(rs.getString("hiredate"));
                to.setDeptno(rs.getString("deptno"));

                lists.add(to);
            }
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { }
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { }
            if (conn != null) try { conn.close(); } catch (SQLException e) { }
        }

        return lists;
    }
}
