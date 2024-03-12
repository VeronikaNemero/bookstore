package by.teachmeskills.store.service;

import by.teachmeskills.store.api.product.ProductRequest;
import by.teachmeskills.store.api.product.ProductResponse;
import by.teachmeskills.store.entity.Product;
import by.teachmeskills.store.mapper.ProductMapper;
import by.teachmeskills.store.repository.ProductRepository;
import by.teachmeskills.store.repository.ProductRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductService {

    public ProductResponse add (ProductRequest productRequest){
        ProductRepository productRepository = new ProductRepositoryImpl();
        ProductMapper productMapper = new ProductMapper();
        Product product = productMapper.toEntity(productRequest);
        productRepository.add(product);
        ProductResponse productResponse = productMapper.toResponse(product);
        return productResponse;
    }

    public List<ProductResponse> allProducts() {
        ProductRepository productRepository = new ProductRepositoryImpl();
        ProductMapper productMapper = new ProductMapper();
        List<ProductResponse> productResponses = new ArrayList<>();
        Collection<Product> products = productRepository.allProducts();
        for (Product product : products) {
            ProductResponse productResponse = productMapper.toResponse(product);
            productResponses.add(productResponse);
        }
        return productResponses;
    }
}
