package models.services;

import models.entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductImpl implements IProduct{
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 11", "Phone", "rat xin so", 20, 799.0));
        products.put(2, new Product(2, "Iphone 12", "Phone", "xin so", 25, 1200.00));
        products.put(3, new Product(3, "Iphone Xs", "Phone", "xin so", 10, 899.0));
        products.put(4, new Product(4, "Alienware", "Laptop", " cuc xin so", 30, 3000.0));
        products.put(5, new Product(5, "Samsung QLED 50 inch man hinh cong", "TV", "xin vcl", 20, 2500.0));
    }

    @Override
    public List<Product> findAll() { return new ArrayList<>(products.values()); }

    @Override
    public boolean save(Product product) {
        products.put(product.getId(), product);
        return true;
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public boolean update(int id, Product product) {
        products.put(id, product);
        return true;
    }

    @Override
    public boolean remove(int id) {
        products.remove(id);
        return true;
    }
}
