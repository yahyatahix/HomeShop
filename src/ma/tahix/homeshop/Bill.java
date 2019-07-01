package ma.tahix.homeshop;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products;

    public Bill(Customer customer){
        this.customer = customer;
    }

    /**
     * add a product with a quantity in the bill
     * @param product
     * @param quantity
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCostomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
