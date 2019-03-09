package factoryMethod;

public class FruitFactoryTest {
    public static void main (String[] args){
        new AppleFruitFactory().generator().showFruitName();
        new BananaFruitFactory().generator().showFruitName();
    }
}
