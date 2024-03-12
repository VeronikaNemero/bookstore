package by.teachmeskills.store.mapper;

import by.teachmeskills.store.api.product.ProductRequest;
import by.teachmeskills.store.api.product.ProductResponse;
import by.teachmeskills.store.entity.Product;

public class ProductMapper {

    public Product toEntity(ProductRequest productRequest){
        Product product = new Product();
        product.setId(productRequest.getId());
        product.setArticle(productRequest.getArticle());
        product.setName(productRequest.getName());
        product.setProductType(productRequest.getProductType());
        product.setPrice(productRequest.getPrice());
        product.setAmount(productRequest.getAmount());
        return product;
    }

    public ProductResponse toResponse(Product product){
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setArticle(product.getArticle());
        productResponse.setName(product.getName());
        productResponse.setProductType(product.getProductType());
        productResponse.setPrice(product.getPrice());
        productResponse.setAmount(product.getAmount());
        return productResponse;
    }
}
