package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx03 {
    public static void main(String[] args) {

        // 좀 더 깔끔하게

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "!12345";

        Connection conn = null;

        try {
            // 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
    }
}
