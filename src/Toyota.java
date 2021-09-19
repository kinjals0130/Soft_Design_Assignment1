public class Toyota implements  Product{

    // Price of Toyota
    private int price = 0;

    /**
     * Sets the price of Toyota according to the price set in the database
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
        System.out.println("The price for Toyota has been set to: $" + this.price);
    }
}
