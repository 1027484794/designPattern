package simpleFactory;

public class FruitTest {

    public static void main (String[] args){
        Fruit fruit = FruitFactory.generator("apple");
        fruit.showFruitName();
        FruitFactory.generator("banana").showFruitName();
    }
}
