package service.impl;

import service.Real1;
/**
 * 真实类（被代理的类）
 */
public class RealImpl1 implements Real1 {
    @Override
    public void test() {
        System.out.println("第二个类测试");
    }
}
