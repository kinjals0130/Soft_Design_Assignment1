public class TestFactoryPattern {
    public static void main (String [] args){
        AbstractFactory productFactory = new ProductFactory();
        Product honda = productFactory.createProduct("honda");
        Product toyota = productFactory.createProduct("toyota");
    }
}
