package abstractFactoryMethod;

public class FruitFactoryTest {

    public static  void main (String[] args){
        AppleFruitFactory apple = new AppleFruitFactory();
        apple.creatPrice().showPrice();
        apple.creatSize().showSize();

        BananaFruitFactory banana = new BananaFruitFactory();
        banana.creatPrice().showPrice();
        banana.creatSize().showSize();
    }
}
