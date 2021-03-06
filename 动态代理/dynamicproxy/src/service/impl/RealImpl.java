package service.impl;

import service.Real;

/**
 * 真实类（被代理的类）
 */
public class RealImpl implements Real {

    @Override
    public void test() {
        System.out.println("hello");
    }

    @Override
    public void testParams(String a, String b) {
        System.out.println("hello" + a);
        System.out.println("hello" + b);
    }

    @Override
    public String testReturn(String a) {
        return a;
    }
}
