package com.dao;

import com.model.Product;
import java.util.List;

public interface ProductDao {

    String saveUpdate(Product product);

    List<Product> getAllProduct();

    boolean deleteProduct(int productId);

    Product getById(int productId);

    boolean existingProduct(String name, String type);

}
