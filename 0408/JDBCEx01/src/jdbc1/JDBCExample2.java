package jdbc1;

import java.sql.*;

public class JDBCExample2 {
    public static void main(String[] args) {

        // 사원번호, 사원이름, 급여, 입사일자를 출력하는 프로그램 작성
        // 단, 입사일자 : 2011/11/01

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "select empno, ename, sal, date_format(hiredate, '%Y/%m/%d') hiredate from emp where deptno = 10";
            rs = stmt.executeQuery(sql);

            // 데이터 끝까지
            while (rs.next()) {

                String data = String.format("%s\t%s\t%s\t%s",
                        rs.getString("empno"), rs.getString("ename"),
                        rs.getString("sal"), rs.getString("hiredate"));

                System.out.println(data);
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
