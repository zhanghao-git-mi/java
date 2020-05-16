/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInovationHandler pih = new ProxyInovationHandler();
        pih.setObj(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.Rent();
    }
}
