package abstractFactoryMethod;

public class AppleFruitFactory implements FruitFactory {
    @Override
    public Price creatPrice() {
        return new ApplePrice();
    }

    @Override
    public Size creatSize() {
        return new AppleSize();
    }
}
