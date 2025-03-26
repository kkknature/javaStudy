// 디폴트 패키지 - 현재 디렉터리에 클래스 생성
package com.exam;

public class PackEx01 {
    public static void main(String[] args) {
        System.out.println("PackEx01 실행");
    }
}

// 오류: 기본 클래스 PackEx01을(를) 찾거나 로드할 수 없습니다.
// 원인: java.lang.NoClassDefFoundError: PackEx01 (wrong name: com/exam/PackEx01)