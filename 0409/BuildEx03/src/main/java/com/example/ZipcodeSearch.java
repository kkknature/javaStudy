package com.example;

import java.sql.*;
import java.util.Scanner;

public class ZipcodeSearch {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/project";
        String user = "project";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);
        System.out.print("동이름 입력 > ");
        String dongName = scanner.nextLine();
        scanner.close();

        if (dongName.length() < 2) {
            System.out.println("동이름을 2자 이상 입력해주세요.");
            System.exit(0);
        }
        System.out.println("정상 입력: " + dongName);

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();

            String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String zipcode = rs.getString("zipcode");
                String sido = rs.getString("sido");
                String gugun = rs.getString("gugun");
                String dong = rs.getString("dong");
                String ri = rs.getString("ri");
                String bunji = rs.getString("bunji");

                if(dong.startsWith(dongName)) {
                    System.out.println("[" + zipcode + "] " + sido + " " + gugun + " " + dong + " " + ri + " " + bunji);
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("[에러]: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) { }
            if (stmt != null) try { stmt.close(); } catch (SQLException e) { }
            if (conn != null) try { conn.close(); } catch (SQLException e) { }
        }

    }
}
