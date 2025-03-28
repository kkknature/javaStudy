// 직원
interface Employee {

    // 급여
    void salary();
}

class Employee1 implements Employee {
    
    @Override
    public void salary() {
        // Employee1에 급여 출력
        System.out.println("Employee1에 급여 출력");
    }
        
}

class Employee2 implements Employee {
    
    @Override
    public void salary() {
        // Employee2에 급여 출력
        System.out.println("Employee2에 급여 출력");
    }
        
}

public class PolyEx01 {
    public static void main(String[] args) {
        
        // 일반적인 클래스의 사용
        Employee1 e1 = new Employee1();
        e1.salary();
        Employee2 e2 = new Employee2();
        e2.salary();

        // 다형성을 이용한 사용
        // 부모를 이용해서 자식 내용 호출
        Employee e = new Employee1();
        e.salary();
        e = new Employee2();
        e.salary();
    }
}
