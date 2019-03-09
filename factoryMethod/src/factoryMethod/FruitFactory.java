package factoryMethod;
/**
 * 工厂方法:
 * 优点：1.具体类中也不用在意获取对象时的复杂处理
 *      2.引入的包类名少，代码简洁
 *      3.后期便于扩展，只需要实现工厂方法的接口，在具体是工厂类中返回创建的对象
 *
 * 缺点：1.就是类的数量比较多，不利于代码的理解
 * */
public interface FruitFactory {
    Fruit generator();
}
