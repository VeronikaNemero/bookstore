package by.teachmeskills.store.api.product;

import java.util.Objects;

public class ProductResponse {

    private int id;

    private int article;

    private String name;

    private String ProductType;

    private double price;

    private int amount;

    public ProductResponse() {
    }

    public ProductResponse(int id, int article, String name, String productType, double price, int amount) {
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
        ProductResponse that = (ProductResponse) o;
        return id == that.id && article == that.article && Double.compare(price, that.price) == 0 && amount == that.amount && Objects.equals(name, that.name) && Objects.equals(ProductType, that.ProductType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article, name, ProductType, price, amount);
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "id=" + id +
                ", article=" + article +
                ", name='" + name + '\'' +
                ", ProductType='" + ProductType + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
