import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ProductFactory extends AbstractFactory {

    /**
     * Creates product and sets the price of the product right when the product is created
     * @param productType - String of the product type
     * @return an instance of the created product
     */
    @Override
     Product createProduct(String productType) {
        HashMap<String, Integer> products = new HashMap<String, Integer>();
        try {
            File productDatabase = new File ("src/Products.txt");
            Scanner myReader = new Scanner(productDatabase);
            while (myReader.hasNextLine()){
                String product = myReader.nextLine();
                products.put(product.substring(0, product.lastIndexOf(",")), Integer.parseInt(product.substring(product.lastIndexOf(",") + 1)));
            }
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (productType.equalsIgnoreCase("honda")){
            Honda honda = new Honda();
            honda.setPrice(products.get("Honda"));
            return honda;

        } else if (productType.equalsIgnoreCase("toyota")){
            Toyota toyota = new Toyota();
            toyota.setPrice(products.get("Toyota"));
            return toyota;
        } else {
             return null;
        }
    }
}
