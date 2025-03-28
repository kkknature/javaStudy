package scanner1;

import java.util.Scanner;

public class ScannerEx02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력: ");
        // 입력은 문자열로 받는게 좋음
        String msg = scanner.nextLine();

        System.out.println("입력 내용: " + msg);

        scanner.close();
    }
}
