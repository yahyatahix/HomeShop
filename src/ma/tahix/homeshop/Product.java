package ma.tahix.homeshop;

public class Product {
    private String name;
    private String description;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    private double price;

    /**
     * Diplay a full description of the product
     */
    void look(){

    }

    /**
     * Add the product to a Bill
     * @param bill the concerned bill
     * @param quantiy the quantity to add
     */
    void buy(Bill bill, Integer quantiy){

    }
}
