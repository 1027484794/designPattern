package factoryMethod;

public class BananaFruitFactory implements FruitFactory {
    @Override
    public Fruit generator() {
        return new BananaFruit();
    }
}
