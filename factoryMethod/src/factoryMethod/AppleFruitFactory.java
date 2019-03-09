package factoryMethod;

public class AppleFruitFactory implements FruitFactory{
    @Override
    public Fruit generator() {
        return new AppleFruit();
    }
}
