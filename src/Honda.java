public class Honda implements Product{

    // Price of Honda
    private int price = 0;

    /**
     * Sets the price of Honda according to the price set in the database
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
        System.out.println("The price for Honda has been set to: $" + this.price);
    }
}