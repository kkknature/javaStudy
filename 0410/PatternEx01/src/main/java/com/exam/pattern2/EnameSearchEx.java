package com.exam.pattern2;

import java.util.ArrayList;
import java.util.Scanner;

public class EnameSearchEx {
    public static void main(String[] args) {

        // 실행 클래스

        Scanner sc = new Scanner(System.in);
        System.out.print("사원 이름 : ");
        String strename = sc.nextLine();

        System.out.println("입력: " + strename);

        sc.close();

        // 처리 부분
        EmpDAO dao = new EmpDAO();
        //dao.selectEmp("s");
        ArrayList<EmpTO> lists = dao.selectEmp(strename);

        // 출력
        for (EmpTO to : lists) {
            //System.out.println(to);
            String data = String.format("[%s] %s %s %s %s %s",
                    to.getEmpno(), to.getEname(), to.getJob(), to.getAnnsal(), to.getHiredate(), to.getDeptno());
            System.out.println(data);
        }
    }
}
