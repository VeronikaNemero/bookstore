package by.teachmeskills.store.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 4964708911725387003L;
    private int id;

    private int article;

    private String name;

    private String ProductType;

    private double price;

    private int amount;

    public Product() {
    }

    public Product(int id, int article, String name, String productType, double price, int amount) {
        this.id = id;
        this.article = article;
        this.name = name;
        ProductType = productType;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && article == product.article && Double.compare(price, product.price) == 0 && amount == product.amount && Objects.equals(name, product.name) && Objects.equals(ProductType, product.ProductType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article, name, ProductType, price, amount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", article=" + article +
                ", name='" + name + '\'' +
                ", ProductType='" + ProductType + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
