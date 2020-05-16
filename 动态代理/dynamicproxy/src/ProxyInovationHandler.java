import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态反射类
public class ProxyInovationHandler implements InvocationHandler {
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    /**
     * 调用被代理类的方法，并并返回结果
     * @param proxy 代理类
     * @param method 代理类调用的处理程序的方法对象
     * @param args  参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用真实类（被代理的类）的方法
        Object result = method.invoke(obj,args);
        return result;
    }

    /**
     * 生成代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }
}
