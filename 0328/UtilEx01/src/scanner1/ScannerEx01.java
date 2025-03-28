package scanner1;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {

        // System.in = 표준입력(Keyboard)
        Scanner scanner = new Scanner(System.in);
        // 입력 프롬프트
        System.out.print("입력: ");

        // 엔터키를 통해 입력 동작
        // 단어 입력
        String msg = scanner.next();
        String msg2 = scanner.next();
        System.out.println("입력 내용: " + msg);
        System.out.println("입력 내용: " + msg2);

        scanner.close();
    }
}
