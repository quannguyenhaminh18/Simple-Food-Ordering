package order;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
