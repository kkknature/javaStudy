package jdbc1;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        // 10번 부서의 사원번호, 사원이름, 급여, 연봉을 출력하는 프로그램 작성

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "select empno, ename, sal, sal * 12 + ifnull(comm, 0) 'annsal' from emp where deptno = 10";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("empno") + " " + rs.getString("ename") + " " + rs.getString("sal") + " " + rs.getString("annsal"));
            }

            System.out.println("실행 성공");

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
        }
    }
}
