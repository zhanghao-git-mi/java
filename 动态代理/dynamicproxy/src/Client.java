package dynamicproxy.src;

import proxy.ProxyInovationHandler;
import service.Real;
import service.Real1;
import service.impl.RealImpl;
import service.impl.RealImpl1;

/**
 * 客户端
 * @author 61677
 */
public class Client {
    public static void main(String[] args) {
        //代理类
        ProxyInovationHandler pih = new ProxyInovationHandler();
        //测试第一个类
        RealImpl realImpl = new RealImpl();
        pih.setObj(realImpl);
        Real proxy = (Real) pih.getProxy();
        proxy.test();
        proxy.testParams("张三","李四");
        String a = proxy.testReturn("王五");
        System.out.println(a);
        //测试第二个类
        RealImpl1 realImpl1 = new RealImpl1();
        pih.setObj(realImpl1);
        Real1 proxy1 = (Real1) pih.getProxy();
        proxy1.test();
    }
}
