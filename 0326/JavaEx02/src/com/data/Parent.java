package com.data;

public class Parent {
    public Parent() {
        System.out.println("Hello Parent");
    }

    // 오버라이딩 가능
    public void viewParent() {
        System.out.println("viewParent 호출");
    }
}
