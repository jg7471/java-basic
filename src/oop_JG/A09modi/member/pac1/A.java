package oop_JG.A09modi.member.pac1;

import java.lang.reflect.Method;

public class A {
    public int x;
    int y; // default 기본적으로는 같은 패키지내에서만 사용가능
    private int z;

    public A(){
        x = 1;
        y = 2;
        z = 3;

        method1();
        method2();
        method3();
    }

    public void method1() {}
    void method2(){} //default;
    private void method3(){}

}