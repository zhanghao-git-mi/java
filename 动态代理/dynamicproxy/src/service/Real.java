package service;

/**
 * 真实类（被代理的类）的接口
 */
public interface Real {
    //测试无参数的方法
    void test();
    //测试带参数的方法
    void testParams(String a,String b);
    //测试带返回值的方法
    String testReturn(String a);
}
