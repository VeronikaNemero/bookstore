package by.teachmeskills.store.repository;

import by.teachmeskills.store.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private static final String FILE_PATH = "D:\\coding\\с72\\bookstore\\src\\main\\resources\\products";

    @Override
    public void add(Product product) {
        List<Product> products = allProducts();
        products.add(product);
        serialization(products);
    }

    @Override
    public void deleteByID(Integer productID) {
    }

    @Override
    public List<Product> allProducts() {

        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> products = (List<Product>) objectInputStream.readObject();
            if(products == null) {
                return new ArrayList<>();
            }
            return products;
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void serialization(List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
