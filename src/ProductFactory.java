public class ProductFactory extends AbstractFactory {

    /**
     * Creates product and sets the price of the product
     * @param productType - String of the product type
     * @return an instance of the created product
     */
    @Override
     Product createProduct(String productType) {
         if (productType.equalsIgnoreCase("honda")){
             return new Honda();
         } else if (productType.equalsIgnoreCase("toyota")){
             return new Toyota();
         } else {
             return null;
         }
    }
}
