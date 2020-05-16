/**
 * 真实类（被代理的类）
 */
public class Host implements Rent{
    @Override
    public void Rent() {
        System.out.println("hello");
    }
}
