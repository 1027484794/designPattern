package abstractFactoryMethod;

public class ApplePrice implements Price {
    @Override
    public void showPrice() {
        System.out.println("这是苹果的价格");
    }
}
