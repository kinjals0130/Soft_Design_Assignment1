public abstract class AbstractFactory {
    /**
     * Abstract factory class
     * @param productName - name of the product being created
     * @return an instance of the created product
     */
    abstract Product createProduct(String productType);
}
