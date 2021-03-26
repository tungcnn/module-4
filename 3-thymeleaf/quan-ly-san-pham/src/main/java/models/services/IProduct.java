package models.services;

import models.entities.Product;

import java.util.List;

public interface IProduct {
    List<Product> findAll();

    boolean save(Product product);

    Product findById(int id);

    boolean update(int id, Product product);

    boolean remove(int id);
}
