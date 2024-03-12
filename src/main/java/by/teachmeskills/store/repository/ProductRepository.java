package by.teachmeskills.store.repository;

import by.teachmeskills.store.entity.Product;
import by.teachmeskills.store.entity.User;

import java.util.Collection;

public interface ProductRepository {

    public void add(Product product);

    public void deleteByID(Integer productID);

    public Collection<Product> allProducts();
}
