import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Toyota implements  Product{

    // Price of Toyota
    private int price = 0;

    /**
     * Set the price of Toyota according to the price set in the database
     */
    @Override
    public void setPrice() {
        try {
            File productDatabase = new File ("src/Products.txt");
            Scanner myReader = new Scanner(productDatabase);

            while (myReader.hasNextLine()) {
                String product = myReader.nextLine();
                if(product.startsWith("Toyota")){
                    this.price = Integer.parseInt(product.substring(product.lastIndexOf(",") + 1));
                    break;
                }
            }
            System.out.println("The price for Toyota has been set to: $" + this.price);
        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
