package abstractFactoryMethod;

public class BananaFruitFactory implements FruitFactory {
    @Override
    public Price creatPrice() {
        return new BananaPrice();
    }

    @Override
    public Size creatSize() {
        return new BananaSize();
    }
}
