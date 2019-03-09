package simpleFactory;
/**
 *简单工厂的方法：
 * 优点：1.只需要注重传入的参数来获取对象不用关心创建的对象的复杂过程
 *      2.在后面的业务代码类中只需引入工厂的类，是代码更加简洁
 *
 * 缺点：1.产品结构单一，只能创建这一种类型的产品，不利于后期产品的扩展，
 *        如果要扩展产品就需要修改原来的代码，可能带来其他风险，违反了开闭原则。
 *
 */
public class FruitFactory {
    //传入的字符内容不可控，还有安全隐患
    public static Fruit generator(String fruitType){
        if("apple".equals(fruitType)){
            return new AppleFruit();
        }else if("banana".equals(fruitType)) {
            return new BananaFruit();
        }
        return null;
    }
    //传入的完整的包类名也有安全隐患，类可能找不到,还有可能没有无参构造方法
    public static Fruit create(String className){
        if(null == className || "".equals(className))return null;
        try{
           return (Fruit)Class.forName(className).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //可能会无参构造方法
    public static Fruit getInstance(Class clazz){
        try{
            if(null != clazz)return (Fruit)clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
