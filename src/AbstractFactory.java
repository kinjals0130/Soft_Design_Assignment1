public abstract class AbstractFactory {
    /**
     * Abstract factory class
     * @param productType - name of the product being created
     * @return an instance of the created product
     */
    abstract Product createProduct(String productType);
}
