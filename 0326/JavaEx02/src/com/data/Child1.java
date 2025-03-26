package com.data;

public class Child1 extends Parent {
    public Child1() {
        System.out.println("Hello Child1");
    }

    // @~~ : annotation : compiler 알림기능
    @Override
    public void viewParent() {
        System.out.println("Child1 viewParent 호출");
    }
}
