//用来测试动态代理功能的接口
public interface Rent {
    //测试无参数的方法
    void test();
    //测试带参数的方法
    void testParams(String a,String b);
    //测试带返回值的方法
    String testReturn(String a);
}
